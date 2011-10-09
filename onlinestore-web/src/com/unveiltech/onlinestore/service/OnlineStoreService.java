package com.unveiltech.onlinestore.service;

import java.util.ArrayList;
import java.util.List;



public class OnlineStoreService {
	
	public List<StoreItemDto> getAllOnlineDeals(){
		List<StoreItemDto> storeItemDtos=new ArrayList<StoreItemDto>();
		StoreItemDto storeItemDto1=new StoreItemDto(1, "IPhone", "http://t1.gstatic.com/images?q=tbn:ANd9GcQRJVdwvbBT--LPxVnVipCP_BGwiYmwYbrGS3TCINB7PxKMmp_7lg");
		StoreItemDto storeItemDto2=new StoreItemDto(2, "IPad", "http://t2.gstatic.com/images?q=tbn:ANd9GcSbZqgpSeRZM-qxzqSE1WKMlQO14J3A6-mWqzKmGWVRnsq4svXp");		
		StoreItemDto storeItemDto3=new StoreItemDto(3, "Android", "http://t2.gstatic.com/images?q=tbn:ANd9GcTkFVM_8JWsDPhhjNAJapMGBak3EWo-wkIfeGJPIKbQ0_GHumhzVDRtoH3l");
		
		storeItemDtos.add(storeItemDto1);
		storeItemDtos.add(storeItemDto2);
		storeItemDtos.add(storeItemDto3);
		
		return storeItemDtos;
		
	}

}
