package com.kamala.campaign.AdTest1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "adInfo")
public class adInfo {
	private String partnerName;
	private int id;
	private int duration;
	private String adContent;

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAdContent() {
		return adContent;
	}

	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void put(int id2, adInfo adinfo) {
		// TODO Auto-generated method stub

	}

}
