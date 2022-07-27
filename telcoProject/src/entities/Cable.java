package entities;

public class Cable extends Equipment{

	private String cableLenght;
	private String cableType;
	
	
	public Cable() {
		super();
	}
	
	
	public Cable(String cableLenght, String cableType) {
		super();
		this.cableLenght = cableLenght;
		this.cableType = cableType;
	}
	
	
	public String getCableLenght() {
		return cableLenght;
	}
	public void setCableLenght(String cableLenght) {
		this.cableLenght = cableLenght;
	}
	public String getCableType() {
		return cableType;
	}
	public void setCableType(String cableType) {
		this.cableType = cableType;
	}
	
	
}
