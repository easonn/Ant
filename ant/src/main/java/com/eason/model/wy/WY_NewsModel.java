package com.eason.model.wy;

import java.util.ArrayList;
import java.util.Date;

import com.eason.model.NewsModel;

@SuppressWarnings("hiding")
public class WY_NewsModel implements NewsModel<KeyWords> {
	private String title;
	private String digest;
	private String docurl;
	private String commenturl;
	private int tienum;
	private String tlastid;
	private String label;
	private ArrayList<KeyWords> keyWords;
	private Date date;
	private String networkType;
	private String imgurl;
	private String add1;
	private String add2;
	private String add3;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDigest() {
		return digest;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getDocurl() {
		return docurl;
	}

	public void setDocurl(String docurl) {
		this.docurl = docurl;
	}

	public String getCommenturl() {
		return commenturl;
	}

	public void setCommenturl(String commenturl) {
		this.commenturl = commenturl;
	}

	public int getTienum() {
		return tienum;
	}

	public void setTienum(int tienum) {
		this.tienum = tienum;
	}

	public String getTlastid() {
		return tlastid;
	}

	public void setTlastid(String tlastid) {
		this.tlastid = tlastid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ArrayList<KeyWords> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(ArrayList<KeyWords> keyWords) {
		this.keyWords = keyWords;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAdd3() {
		return add3;
	}

	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	public String getNewsTitle() {
		return this.title;
	}

	public String getNewsUrl() {
		// TODO Auto-generated method stub
		return this.docurl;
	}

	public Date getNewsDate() {
		// TODO Auto-generated method stub
		return this.date;
	}

	public ArrayList<KeyWords> getKeyWordsList() {
		// TODO Auto-generated method stub
		return this.keyWords;
	}

}
