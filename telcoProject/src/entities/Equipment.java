package entities;

public class Equipment {

	private int id;
    private String brandName;
    private String equipmentName;
    private String seriNo;
	private Service service;
	
	
	public Equipment() {
		super();
	}


	public Equipment(int id, String brandName, String equipmentName, String seriNo, Service service) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.equipmentName = equipmentName;
		this.seriNo = seriNo;
		this.service = service;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getEquipmentName() {
		return equipmentName;
	}


	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}


	public String getSeriNo() {
		return seriNo;
	}


	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	} 
	
	
	
}
