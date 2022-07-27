package entities;

public class Modem extends Equipment{
	
	private String portNumber;
	private String modemType;
	
	public Modem() {
		super();
	}
	
	public Modem(String portNumber, String modemType) {
		super();
		this.portNumber = portNumber;
		this.modemType = modemType;
	}
	
	
	public String getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	public String getModemType() {
		return modemType;
	}
	public void setModemType(String modemType) {
		this.modemType = modemType;
	}
	
	

}
