/**
 * 
 */
package com.faraway.analyzer.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author liqiang
 *
  {
    "scode": "002160",
    "sname": "常铝股份",
    "securitytype": "A股",
    "trademarket": "深交所中小板",
    "latestnoticedate": "2018-06-16T00:00:00",
    "reportdate": "2018-03-31T00:00:00",
    "basiceps": 0.0165,
    "cutbasiceps": "-",
    "totaloperatereve": 926391960.45,
    "ystz": 8.07558872,
    "yshz": -21.8473,
    "parentnetprofit": 12137246.22,
    "sjltz": -45.15768625,
    "sjlhz": -79.8264,
    "roeweighted": 0.36,
    "bps": 4.53607148,
    "mgjyxjje": -0.04843011,
    "xsmll": 14.66551833,
    "publishname": "有色金属",
    "assigndscrpt": "-",
    "gxl": "-",
    "securitytypecode": "058001001",
    "trademarketcode": "069001002003",
    "firstnoticedate": "2018-04-27T00:00:00"
  }
 *
 */
@JsonPropertyOrder({"scode", "sname", "securitytype", "trademarket", "latestnoticedate", "reportdate", "basiceps", "cutbasiceps", 
	"totaloperatereve", "ystz", "yshz", "parentnetprofit", "sjltz", "sjlhz", "roeweighted", "bps", "mgjyxjje", "xsmll", 
	"publishname", "assigndscrpt", "gxl", "securitytypecode", "trademarketcode", "firstnoticedate",})
@JsonSerialize()
public class StockReport implements Serializable {

	private static final long serialVersionUID = 201806292312L;
	private String scode;
	private String sname;
	private String securitytype;
	private String trademarket;
	private Date latestnoticedate;
	private Date reportdate;
	private double basiceps;
	private double cutbasiceps;
	private double totaloperatereve;
	private double ystz;
	private double yshz;
	private double parentnetprofit;
	private double sjltz;
	private double sjlhz;
	private double roeweighted;
	private double bps;
	private double mgjyxjje;
	private double xsmll;
	private String publishname;
	private String assigndscrpt;
	private String gxl;
	private String securitytypecode;
	private String trademarketcode;
	private Date firstnoticedate;
	
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSecuritytype() {
		return securitytype;
	}
	public void setSecuritytype(String securitytype) {
		this.securitytype = securitytype;
	}
	public String getTrademarket() {
		return trademarket;
	}
	public void setTrademarket(String trademarket) {
		this.trademarket = trademarket;
	}
	public Date getLatestnoticedate() {
		return latestnoticedate;
	}
	public void setLatestnoticedate(Date latestnoticedate) {
		this.latestnoticedate = latestnoticedate;
	}
	public Date getReportdate() {
		return reportdate;
	}
	public void setReportdate(Date reportdate) {
		this.reportdate = reportdate;
	}
	public double getBasiceps() {
		return basiceps;
	}
	public void setBasiceps(double basiceps) {
		this.basiceps = basiceps;
	}
	public double getCutbasiceps() {
		return cutbasiceps;
	}
	public void setCutbasiceps(double cutbasiceps) {
		this.cutbasiceps = cutbasiceps;
	}
	public double getTotaloperatereve() {
		return totaloperatereve;
	}
	public void setTotaloperatereve(double totaloperatereve) {
		this.totaloperatereve = totaloperatereve;
	}
	public double getYstz() {
		return ystz;
	}
	public void setYstz(double ystz) {
		this.ystz = ystz;
	}
	public double getYshz() {
		return yshz;
	}
	public void setYshz(double yshz) {
		this.yshz = yshz;
	}
	public double getParentnetprofit() {
		return parentnetprofit;
	}
	public void setParentnetprofit(double parentnetprofit) {
		this.parentnetprofit = parentnetprofit;
	}
	public double getSjltz() {
		return sjltz;
	}
	public void setSjltz(double sjltz) {
		this.sjltz = sjltz;
	}
	public double getSjlhz() {
		return sjlhz;
	}
	public void setSjlhz(double sjlhz) {
		this.sjlhz = sjlhz;
	}
	public double getRoeweighted() {
		return roeweighted;
	}
	public void setRoeweighted(double roeweighted) {
		this.roeweighted = roeweighted;
	}
	public double getBps() {
		return bps;
	}
	public void setBps(double bps) {
		this.bps = bps;
	}
	public double getMgjyxjje() {
		return mgjyxjje;
	}
	public void setMgjyxjje(double mgjyxjje) {
		this.mgjyxjje = mgjyxjje;
	}
	public double getXsmll() {
		return xsmll;
	}
	public void setXsmll(double xsmll) {
		this.xsmll = xsmll;
	}
	public String getPublishname() {
		return publishname;
	}
	public void setPublishname(String publishname) {
		this.publishname = publishname;
	}
	public String getAssigndscrpt() {
		return assigndscrpt;
	}
	public void setAssigndscrpt(String assigndscrpt) {
		this.assigndscrpt = assigndscrpt;
	}
	public String getGxl() {
		return gxl;
	}
	public void setGxl(String gxl) {
		this.gxl = gxl;
	}
	public String getSecuritytypecode() {
		return securitytypecode;
	}
	public void setSecuritytypecode(String securitytypecode) {
		this.securitytypecode = securitytypecode;
	}
	public String getTrademarketcode() {
		return trademarketcode;
	}
	public void setTrademarketcode(String trademarketcode) {
		this.trademarketcode = trademarketcode;
	}
	public Date getFirstnoticedate() {
		return firstnoticedate;
	}
	public void setFirstnoticedate(Date firstnoticedate) {
		this.firstnoticedate = firstnoticedate;
	}  
}
