package com.unveiltech.onlinestore.service;

public class StoreItemDto {
	
	private long id;
	private String name;
	private String imageurl;
	
	
	
	public StoreItemDto(long id, String name, String imageurl) {
		super();
		this.id = id;
		this.name = name;
		this.imageurl = imageurl;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	
	

}
