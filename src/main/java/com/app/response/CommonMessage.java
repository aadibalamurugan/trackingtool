package com.app.response;

public class CommonMessage
{
	private String message;
	private String code;
	private TrackingDetailsResponse tracingrresponse;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public TrackingDetailsResponse getTracingrresponse() {
		return tracingrresponse;
	}
	public void setTracingrresponse(TrackingDetailsResponse tracingrresponse) {
		this.tracingrresponse = tracingrresponse;
	}
	@Override
	public String toString() {
		return "CommonMessage [message=" + message + ", code=" + code + ", tracingrresponse=" + tracingrresponse + "]";
	}
	
	

}
