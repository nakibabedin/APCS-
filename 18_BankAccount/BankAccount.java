/*

*/

public class BankAccount {
	String fullName;
	String password;
	int pin;
	int accountNumber;
	double accountBalance;

	public BankAccount() {
	}
	
	public BankAccount(String FullName, String Password, int Pin, int AccountNumber, double AccountBalance){
		String fullName = FullName;
        	String password = Password;
        	int pin = Pin;
        	int accountNumber = AccountNumber;
        	double accountBalance = AccountBalance;
	}
	
	public void setName(String name) {
		fullName = name;
	}
	public void setPassword(String pass) {
		password = pass;
	}
	public void setPin(int pinNo) {
		pin = pinNo;
	}
	public void setAccountNumber(int actno) {
		accountNumber = actno;
	}
	public void setAccountBalance(double bal) {
		accountBalance = bal;
	}


	public static void printAll (String FullName, String Password, int Pin, int AccountNumber, double AccountBalance) {
		System.out.println(FullName);
		System.out.println(Password);
		System.out.println(Pin);
		System.out.println(AccountNumber);
		System.out.println(AccountBalance);
	}

	public void printAllnotVoid() {
                System.out.println(fullName);
                System.out.println(password);
                System.out.println(pin);
                System.out.println(accountNumber);
                System.out.println(accountBalance);
        }

	public static void main (String[] args){
		printAll("ol Nakib", "NotPassword", 42069, 123456, 532.00);
		BankAccount nakib = new BankAccount();
	}
}

