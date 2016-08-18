package com.kamala.campaign.AdTest1;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class adServiceImpl implements adService {

	private int currentid = 10;

	Map<Long, adInfo> adinfo = new HashMap<Long, adInfo>();

	public adServiceImpl() {
		init();
	}

	final void init() {
		// TODO Auto-generated method stub

		adInfo adinfo = new adInfo();
		adinfo.setId(currentid);
		adinfo.setPartnerName("XpartnerName");
		adinfo.setDuration(10);
		adinfo.setAdContent("20% off sale for next 10 mins");
		adinfo.put(adinfo.getId(), adinfo);
	}

	public adInfo getAd(String id) {
		// TODO Auto-generated method stub
		Long partnerid = Long.parseLong(id);
		adInfo adInfo2 = adinfo.get(partnerid);
		return adInfo2;
	}

	public Response createtAd(adInfo adinfo) {
		// TODO Auto-generated method stub
		System.out.println("Creading ad for the parner"
				+ adinfo.getPartnerName());
		adinfo.setId(++currentid);
		adinfo.put(adinfo.getId(), adinfo);
		return Response.ok(adinfo).build();
	}

}
