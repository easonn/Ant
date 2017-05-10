package com.eason.ant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.eason.model.wy.KeyWords;
import com.eason.model.wy.WY_NewsModel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            new App().captureWYJavascript();
            // Document doc =
            // Jsoup.connect("http://money.163.com/stock/").get();
            // Elements data_list = doc.getElementsByClass("newsdata_list");
            // Elements news_list =
            // data_list.first().getElementsByClass("na_detail");
            // ;
            // for (Element news_mode : news_list) {
            // String url =
            // news_mode.getElementsByTag("a").first().attr("href");
            // System.out.println(url);
            // }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public ArrayList<WY_NewsModel> captureWYJavascript() throws Exception {
        String strURL = "http://money.163.com/special/002557S6/newsdata_gp_index.js?callback=data_callback";
        URL url = new URL(strURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        InputStreamReader input = new InputStreamReader(httpConn.getInputStream(), "GBK");
        BufferedReader bufReader = new BufferedReader(input);
        String line = "";
        StringBuilder contentBuf = new StringBuilder();
        while ((line = bufReader.readLine()) != null) {
            contentBuf.append(line);
        }
        String jsonStr = contentBuf.toString().trim();
        List<WY_NewsModel> newsList = JSON.parseArray(jsonStr.substring(14, jsonStr.length() - 1), WY_NewsModel.class);
        // System.out.println("captureJavascript()的结果：\n" + newslist.get(0));

        for (WY_NewsModel news : newsList) {
            System.out.println(news.getTitle() + "--" + news.getDocurl());
            if (0 != news.getKeyWords().size()) {
                for (KeyWords keyWords : news.getKeyWords()) {
                    // if (keyWords.getKeyname().contains("乐视")) {
                    System.err.println("[" + keyWords.getKeyname() + "---" + keyWords.getAkey_link() + "]");
                    // }
                    // System.err.print(keyWords.getKeyname() + "\t");
                }
            }
            System.out.println();
        }
        return (ArrayList<WY_NewsModel>) newsList;
    }
}
