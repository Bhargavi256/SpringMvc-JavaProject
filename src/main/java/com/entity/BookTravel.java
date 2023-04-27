package com.entity;

public class BookTravel {
    
	private String from_address;
	
	private String to_address;

	public String getFrom_address() {
		return from_address;
	}

	public void setFrom_address(String from_address) {
		this.from_address = from_address;
	}

	public String getTo_address() {
		return to_address;
	}

	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}

	public BookTravel(String from_address, String to_address) {
		
		this.from_address = from_address;
		this.to_address = to_address;
	}

	@Override
	public String toString() {
		return "BookTravel [from_address=" + from_address + ", to_address=" + to_address + "]";
	}
	
	
}
