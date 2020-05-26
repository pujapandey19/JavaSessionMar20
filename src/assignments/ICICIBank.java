package assignments;

public class ICICIBank implements USBank, UKBank, RBI {

	@Override
	public void bankGuarantee() {
		System.out.println("RBI- Bank Gurantee");

	}

	@Override
	public void acceptingDeposit() {

		System.out.println("RBI- Accepting Deposits ");
	}

	@Override
	public void discountingofBOE() {
		System.out.println("RBI - Discounting Of Bills Of Exchange");

	}

	@Override
	public void creditCards() {
		System.out.println("UK Bank - Credit Card");

	}

	@Override
	public void advancingLoans() {
		System.out.println("UK Bank - Advancing Loans");

	}

	@Override
	public void foreignCurrencyExchange() {
		System.out.println("UKBank - Foreign Currency Exchange");

	}

	@Override
	public void fundTransfer() {
		System.out.println("USBank - Fund Transfer ");

	}

	@Override
	public void driveThruService() {
		System.out.println("USBank - DriveThru  Services ");

	}

	@Override
	public void mobileBanking() {
		System.out.println("USBank - Mobile Banking ");

	}

	public void onlineBanking() {
		System.out.println("ICICI - Online Banking");
	}

	public void overDraft() {
		System.out.println("ICICI - Overdraft");
	}

}
