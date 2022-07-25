package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class FinancialStatement {
	private int id;
	private Customer customer;
	private double currency;
	private LocalDate date;
	
	public FinancialStatement() {
		super();
	}

	public FinancialStatement(int id, Customer customer, double currency, LocalDate date) {
		super();
		this.id = id;
		this.customer = customer;
		this.currency = currency;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
