package com.java.hexter.internetweather.oo;

public class InternetWeather {

	public static void main(String[] args) {
		CurrentConditions mCurrentConditions;
		WeatherData mWeatherData;
		//CurrentConditions为公告板，WeatherData为气象站，让公告板作为气象站的初始化参数。(问题是不同的公司的公告板的情况下，要为WeatherData为气象站的构造函数添加很多参数吗？)
		mCurrentConditions=new CurrentConditions();
		mWeatherData=new WeatherData(mCurrentConditions);
		
		mWeatherData.setData(30, 150, 40);
	}

}
