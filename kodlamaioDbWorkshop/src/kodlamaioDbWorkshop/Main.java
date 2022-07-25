package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Channel channel1 = new Channel(1,"Ýnternet");
		Channel channel2 = new Channel(2,"Þube");
		
		Customer customer = new IndividualCustomer(1,"123",channel1,"Ferhat","ÇELÝK","45612378912");
		Customer customer2 = new CorporateCustomer(1,"987",channel2,"Kodlamaio","4250");
		
		FinancialStatement financialStatement = new FinancialStatement(1,customer2,54000,LocalDate.parse("2022-07-25"));
		
		
		System.out.println(((IndividualCustomer) customer).getFirstName());
		System.out.println(customer.getChannel().getName());
		
		
		System.out.println(((CorporateCustomer) financialStatement.getCustomer()).getCompanyName() + " : " + financialStatement.getCurrency());
	}

}
