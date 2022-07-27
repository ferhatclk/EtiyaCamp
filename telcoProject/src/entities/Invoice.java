package entities;

import java.time.LocalDate;


public class Invoice {

	private int id;
	private LocalDate dateCreated;
	private LocalDate dueDate;
	private Subscription subscription;
	private Payment payment;
	
	public Invoice() {
		super();
	}
	public Invoice(int id, LocalDate dateCreated, LocalDate dueDate,
			Subscription subscription, Payment payment) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
		this.subscription = subscription;
		this.payment = payment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
}
