/*

*/

public class BankAccount {
	String Fullname;
	String Password;
	int Pin;
	int AccountNumber;
	double AccountBalance;

	public BankAccount() {

	}
	public void setName(String name) {
		Fullname = name;
	}
	public void setPassword(String pass) {
		Password = pass;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public void setAccountNumber(int actno) {
		AccountNumber = actno;
	}
	public void setAccountBalance(double bal) {
		AccountBalance = bal;
	}
	public void printAll (String FullName, String Password, int Pin, int AccountNumber, int AccountBalance) {
	System.out.println(FullName);
	System.out.println(Password);
	System.out.println(Pin);
	System.out.println(AccountNumber);
	System.out.println(AccountBalance);
	}
}

