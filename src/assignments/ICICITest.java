package assignments;

public class ICICITest {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();
		ic.fundTransfer();
		ic.driveThruService();
		ic.mobileBanking();
		System.out.println("Maximum transfer a/c in One day is : " + " " + "$" + USBank.maxTrPerDay);
		System.out.println("*******************************");
		ic.creditCards();
		ic.advancingLoans();
		ic.foreignCurrencyExchange();
		System.out.println("*******************************");
		ic.bankGuarantee();
		ic.acceptingDeposit();
		ic.discountingofBOE();
		System.out.println("*******************************");
		// ICICI Methods
		ic.onlineBanking();
		ic.overDraft();

		// Accessing through child class object and parent interface reference
		// variables(top-casting)
		USBank us = new ICICIBank();
		us.fundTransfer();
		us.driveThruService();
		us.mobileBanking();

		UKBank uk = new ICICIBank();
		uk.advancingLoans();
		uk.creditCards();
		uk.foreignCurrencyExchange();

		RBI rb = new ICICIBank();
		rb.acceptingDeposit();
		rb.discountingofBOE();
		rb.bankGuarantee();

	}

}
