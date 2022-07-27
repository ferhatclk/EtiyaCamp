import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Address;
import entities.AddressType;
import entities.Canal;
import entities.Customer;
import entities.Equipment;
import entities.IndividualCustomer;
import entities.Invoice;
import entities.Payment;
import entities.Service;
import entities.Subscription;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new IndividualCustomer(1, null, "32424", null, "21176490023", "Mücahit", "Altýnsoy");
        	
		Address address = new Address(1, "Ardahan", null, customer);
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		
		AddressType addressType = new AddressType(1, "Ev Adresi", addresses);
		
		address.setAddressTypeId(addressType);
		
		Subscription subscription = new Subscription(1, LocalDate.parse("2022-01-01"), LocalDate.parse("2023-01-01"), customer, null, null);
		
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		subscriptions.add(subscription);
		
		Service service = new Service(1, "adsl",subscriptions, null);
		
		Equipment equipment = new Equipment(1, "TT", "Modem", "423442", service);
		
		List<Equipment> equipments = new ArrayList<Equipment>();
		equipments.add(equipment);
		
		service.setEquipments(equipments);
		
		Invoice invoice = new Invoice(1, LocalDate.parse("2022-01-01"), LocalDate.parse("2023-01-01"), subscription, null);
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoices.add(invoice);
		
		
		Payment payment = new Payment(1, null, LocalDate.parse("2022-01-01"), invoice);
		
		List<Payment> payments = new ArrayList<Payment>();
		payments.add(payment);
		
		Canal canal = new Canal(1, "internet", payments);
		
		payment.setCanalId(canal);
		
		invoice.setPayment(payment);
		
		subscription.setInvoices(invoices);
		
		subscription.setServiceId(service);
		
		subscription.setCustomerId(customer);
		
		customer.setAddresses(addresses);
		customer.setSubscriptions(subscriptions);
		
		System.out.println(customer.getAddresses().get(0).getAddressDescription()+customer.getSubscriptions().get(0).getInvoices().get(0).getPayment().getPaymentDate());
	}

}
