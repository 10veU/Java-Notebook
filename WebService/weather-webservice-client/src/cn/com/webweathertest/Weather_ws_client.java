package cn.com.webweathertest;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Weather_ws_client {
	public static void main(String[] args) {
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
		ArrayOfString weather = weatherWSSoap.getWeather("Î÷°²", null);
		List<String> weatherInfo = weather.getString();
			System.err.println(weatherInfo);
		for (String weatherStr : weatherInfo) {
			System.out.println(weatherStr+"======>>>>>>");
		}
	}
}
