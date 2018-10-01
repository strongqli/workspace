/**
 * 
 */
package com.faraway.analyzer.service;

import java.util.List;

import com.faraway.analyzer.mapper.StockReportMapper;
import com.faraway.analyzer.model.StockReport;
import com.faraway.analyzer.service.crawler.StockReportCrawler;

/**
 * @author liqiang
 *
 */
public class StockReportService {
	
	protected StockReportMapper stockReportMapper;
	protected StockReportCrawler stockReportCrawler;
	public StockReportService(StockReportMapper mapper, StockReportCrawler crawler) {
		this.stockReportMapper = mapper;
		this.stockReportCrawler = crawler;
		
	}
	public List<StockReport> getStockReport(String code) {
		List<StockReport> reportList = stockReportMapper.findReportByCode(code);
		if (reportList == null || reportList.size() == 0) {
			if (stockReportCrawler.crawlStockReport(code)) {
				return stockReportMapper.findReportByCode(code);
			}
		}
		return null;
	}

}
