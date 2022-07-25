package kodlamaioDbWorkshop;

public class CorporateCustomer extends Customer{
	private String companyName;
	private String taxNo;
	
	public CorporateCustomer() {
		super();
	}
	
	public CorporateCustomer(int id, String customerNo, Channel channel, String companyName, String taxNo) {
		super(id, customerNo, channel);
		this.companyName = companyName;
		this.taxNo = taxNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	
	
}
