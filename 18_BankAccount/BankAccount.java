/*
TNPG: NAW Fam |Roster: Alif Rahman, Nakib Abedin
APCS
HW 18 -- CPA-One
2021-10-17

DISCOVERIES:
1) From our experiences, you can not have instance variables as parameters when you call them in a static method.
2) When you apply methods that change certain attributes for an object, those changes will remain from that point onwards.
3) It is useful to have a line denoting "<METHODNAME> TESTING" when you call multiple methods inside of your main method.
QCC:
1) Why did the overload constructor not work when we tried to create a new instance with it? It just returned the values that Java sets when we initialize a variable (e.g. null for Strings, 0 for ints, and 0.0 for doubles).   
2) Why did the printAll method work only after we applied it to an object. When we tried to call it without an object, it returned an error.
Team NAW Fam's Latest and Greatest Q2 Response:
We know that java has a default constructor because we were able to create a new instance of a class without using the "new" KEYWORD without creating any constructors for HW12
Team NAW Fam's Latest and Greatest Q3 Response:
We think that you can try to create an instance of the object and do System.out.println(<objectName>). Whatever it prints is the string representation of the object.
*/

public class BankAccount {
	String fullName;
	String password;
	int pin;
	int accountNumber;
	double accountBalance;
	
	// Created the instance variable

	public BankAccount() {
	}

	// Default Constructor created

	/*
	We created a overload constructor but we had issues in its implementation. We decided to use the default constructor and use the set<variable> methods to achieve the same functionality.

	public BankAccount(String FullName, String Password, int Pin, int AccountNumber, double AccountBalance){
		String fullName = FullName;
        	String password = Password;
        	int pin = Pin;
        	int accountNumber = AccountNumber;
        	double accountBalance = AccountBalance;
	}
	*/
	
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

	//Method List full of methods that assign values to each of the instance variables that we created.

	public void deposit(double amount){
		double oldAccountBalance = accountBalance;
		accountBalance += amount;
		double newAccountBalance = accountBalance;
		System.out.println("DEPOSIT METHOD TEST:");
		System.out.println("Old balance = " + oldAccountBalance);
		System.out.println("New balance = " + newAccountBalance);
	}
	public void withdraw(double amount){
                double oldAccountBalance = accountBalance;
                accountBalance -= amount;
                double newAccountBalance = accountBalance;
                System.out.println("WITHDRAW METHOD TEST:");
                System.out.println("Old balance = " + oldAccountBalance);
                System.out.println("New balance = " + newAccountBalance);
        }
	
	// for the withdraw and deposit functions, we tested them by storing their initial values in a variable and then storing their new values in a different variable. We printed these variables to see if the balance of the bank account changed accordingly.
	public void printAll(){
		System.out.println("printAll METHOD TEST");
                System.out.println(fullName);
                System.out.println(password);
                System.out.println(pin);
                System.out.println(accountNumber);
                System.out.println(accountBalance);
        }

	public static void main (String[] args){
		BankAccount nakib = new BankAccount();
		nakib.setName("nakib");
		nakib.setPassword("NotPassword");
		nakib.setPin(4562);
		nakib.setAccountNumber(1234567890);
		nakib.setAccountBalance(10.00);
		nakib.printAll();
		nakib.deposit(100.00);
		nakib.withdraw(5.00);
		// The overload constructor wasn't working properly for some reason. Instead, we created an object with the "new" Keyword and assigned values to the instance variable with the set<variable> methods.
		System.out.print(nakib);	
}
}

