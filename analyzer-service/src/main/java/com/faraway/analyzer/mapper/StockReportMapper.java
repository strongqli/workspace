package com.faraway.analyzer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.faraway.analyzer.model.StockReport;

@Mapper
public interface StockReportMapper {
	
	@Select("select * from stock_report where code=#{code}")
	List<StockReport> findReportByCode(@Param("code")String code);
}
