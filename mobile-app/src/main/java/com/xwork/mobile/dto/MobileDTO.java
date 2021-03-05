package com.xwork.mobile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" mobiles_table")
public class MobileDTO implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6292372684132346799L;

	@Column(name="MOBILEID")
	@Id
	int mobileId;
	
	@Column(name="BRAND")
	String brand;
	
	@Column(name="MOBILESERIESNAME")
	String mobileSeriesName;
	
	@Column(name="PRICE")
	double price;
	
	@Column(name="COLOR")
	String color;
	
	@Column(name="BATTERYCAPACITY")
	int batteryCapacity;
	
	public MobileDTO() {
		
	}
	public MobileDTO(int mobileId, String brand, String mobileSeriesName, double price, String color,
			int batteryCapacity) {
		super();
		this.mobileId = mobileId;
		this.brand = brand;
		this.mobileSeriesName = mobileSeriesName;
		this.price = price;
		this.color = color;
		this.batteryCapacity = batteryCapacity;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMobileSeriesName() {
		return mobileSeriesName;
	}
	public void setMobileSeriesName(String mobileSeriesName) {
		this.mobileSeriesName = mobileSeriesName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String toString() {
		return "MobilessDTO [mobileId=" + mobileId + ", brand=" + brand + ", mobileSeriesName=" + mobileSeriesName
				+ ", price=" + price + ", color=" + color + ", batteryCapacity=" + batteryCapacity + "]";
	}
	
	
	

}
