package com.faraway.analyzer.service.crawler;

import org.json.JSONArray;
import org.springframework.web.client.RestTemplate;


public class EastMoneyStockReportCrawler implements StockReportCrawler {
	
	private final String DEFAULT_TOKEN= "70f12f2f4f091e459a279469fe49eca5";
	
	String urlFormat = "http://dcfm.eastmoney.com//em_mutisvcexpandinterface/api/js/get?type=YJBB20_YJBB&token=%s&st=reportdate&sr=-1&filter=(scode=%s)";
	public EastMoneyStockReportCrawler() {
		
	}

	@Override
	public boolean crawlStockReport(String code) {
		RestTemplate restTemplate = new RestTemplate();
		String url = String.format(urlFormat, DEFAULT_TOKEN, code);
		String object = restTemplate.getForObject(url, String.class);
		System.out.println(object);
		return false;
	}
	
	public static void main(String[] args) {
		EastMoneyStockReportCrawler crawler = new EastMoneyStockReportCrawler();
		crawler.crawlStockReport("000039");
	}

}
