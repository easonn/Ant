package com.eason.model;

import java.util.ArrayList;
import java.util.Date;

public interface NewsModel<E> {

	public String getNewsTitle();

	public String getNewsUrl();

	public ArrayList<E> getKeyWordsList();

	public Date getNewsDate();
	
	
}
