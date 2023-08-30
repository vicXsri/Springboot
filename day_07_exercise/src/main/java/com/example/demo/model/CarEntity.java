package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Cars")
public class CarEntity {
	
	@Id
	private Integer id;
	private String CarName;
	private String CarType;
	private int Owners;
	private String CurrentOwnersName;
	private long mobile;
	private String address;
	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarEntity(Integer id, String carName, String carType, int owners, String currentOwnersName, long mobile,
			String address) {
		super();
		this.id = id;
		this.CarName = carName;
		this.CarType = carType;
		this.Owners = owners;
		this.CurrentOwnersName = currentOwnersName;
		this.mobile = mobile;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public int getOwners() {
		return Owners;
	}
	public void setOwners(int owners) {
		Owners = owners;
	}
	public String getCurrentOwnersName() {
		return CurrentOwnersName;
	}
	public void setCurrentOwnersName(String currentOwnersName) {
		CurrentOwnersName = currentOwnersName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	



}
