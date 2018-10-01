/**
 * 
 */
package com.faraway.analyzer.controller;
import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faraway.analyzer.model.StockReport;
import com.faraway.analyzer.service.StockReportService;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author liqiang
 *
 */
@RestController
public class StockReportController {
	@Autowired
	StockReportService stockReportService;
	
	@RequestMapping("/stockreport/{CODE}")
	public JSONArray getStockReport(@PathVariable("CODE") String code){
		List<StockReport> reportList =  stockReportService.getStockReport(code);
		JSONArray jsonArray=new JSONArray(reportList);
		return jsonArray;
	}
}