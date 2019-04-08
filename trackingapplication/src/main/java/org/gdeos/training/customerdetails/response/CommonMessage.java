package org.gdeos.training.customerdetails.response;

import java.io.Serializable;






/*@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder*/
public class CommonMessage implements Serializable 
{

	private static final long serialVersionUID = 1L;
	private  String message;
	private  String code;
	private CustomerDetailsResponse tracingrresponse;
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
	public CustomerDetailsResponse getTracingrresponse() {
		return tracingrresponse;
	}
	public void setTracingrresponse(CustomerDetailsResponse tracingrresponse) {
		this.tracingrresponse = tracingrresponse;
	}
	
	
}
