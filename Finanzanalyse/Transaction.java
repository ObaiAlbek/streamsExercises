package streams.Finanzanalyse;

public class Transaction {
	
	private String sender_name; //absenderName
	private String sender_account; //absenderKonto
	private String receiver_name; //empfaengerName
	private String receiver_account; //empfaengerKonto
	private double amount; //betrag
	private String currency; //waehrung
	private String receiver_Country; //empfaengerLand
	
	public Transaction(String sender_name, String sender_account, String receiver_name, String receiver_account,
			double amount, String currency, String receiver_Country) {
		this.sender_name = sender_name;
		this.sender_account = sender_account;
		this.receiver_name = receiver_name;
		this.receiver_account = receiver_account;
		this.amount = amount;
		this.currency = currency;
		this.receiver_Country = receiver_Country;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getSender_account() {
		return sender_account;
	}

	public void setSender_account(String sender_account) {
		this.sender_account = sender_account;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_account() {
		return receiver_account;
	}

	public void setReceiver_account(String receiver_account) {
		this.receiver_account = receiver_account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getReceiver_Country() {
		return receiver_Country;
	}

	public void setReceiver_Country(String receiver_Country) {
		this.receiver_Country = receiver_Country;
	}

	@Override
	public String toString() {
		return "Transaction [sender_name=" + sender_name + ", sender_account=" + sender_account + ", receiver_name="
				+ receiver_name + ", receiver_account=" + receiver_account + ", amount=" + amount + ", currency="
				+ currency + ", receiver_Country=" + receiver_Country + "]";
	}

}
