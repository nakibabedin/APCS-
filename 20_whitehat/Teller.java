/*
TNPG: NAW Fam (Alif Rahman, Nakib Abedin)
APCS pd06
HW 20 -- External Audit
2021-10-18
Discoveries:
1) Java interprets literals that start with "0" as octal values.
2) A unique error is PRINTED when some variables aren't initialized and using methods that require variables to be initialized.
Error:
Exception in thread "main" java.lang.NullPointerException
at BankAccount.withdraw(BankAccount.java:89)
at Teller.main(Teller.java:56)
QCC:
1) Why is the error above printed instead of recognized as a syntax error?
*/

public class Teller {
	public static void main(String[] args) {
		// Can Josiah Beautify?'s code block for the main method below

		/*
		BankAccount cjb = new BankAccount("Lawrence Parker", 123456789, 3579, "password", -42.0);
		cjb.printInfo();
		cjb.setName("Can Josiah Beautify?");
		cjb.setAccountNum(226238705);
		cjb.setPin(8191);
		cjb.setPassword("hackme");
		cjb.setBalance(4200.0);
		cjb.printInfo();
		cjb.deposit(58.0);
		cjb.printInfo();
		cjb.withdraw(100.01);
		cjb.printInfo();
		cjb.setAccountNum(-1);
		cjb.setAccountNum(2000000000);
		cjb.setPin(-1);
		cjb.setPin(99999);
		cjb.printInfo();
		//System.out.println(cjb);
		//System.out.print(cjb + " hello");
		//System.out.println(cjb.toString());
		*/

		BankAccount hackerLol = new BankAccount();
		hackerLol.setName("Can Josiah Beautify?");
		hackerLol.setAccountNum(226238705);
		hackerLol.setPin(8191);
		hackerLol.setPassword("hackme");
		hackerLol.setBalance(4200.0);
		hackerLol.printInfo();

		// Testing

		hackerLol.setAccountNum(001000000); // We don't think you wanted your function to return 262144 with this input.
  	hackerLol.setPin(0123); // We assume that this input isn't meant to be 83.
		hackerLol.printInfo();

		/*
		We included the two method calls above even though we don't fully why it breaks the code. All we have deduced so far is
		that int arguments that start with the digit 0 get converted into something else, but we don't know exactly what it gets
		converted to. We counsulted Piazza and hopefully we will have an answer soon. UPDATE: From the help of our classmates in
		Piazza, we now now that the error occured because Java interprets literals that start with "0" as octal values.
		To solve these issues you can set the minimum value for a pin to be greater than or equal to 1000 and the max to be less than 10000
		Likewise, you can set the minimum value for an account number to 100000000 the maximum as 999999999.
		*/

		hackerLol.setAccountNum(0); // Account Number should not be allowed to have less than 9 digits.
		hackerLol.setPin(0); // PIN Number should not be allowed to have less than 4 digits.
		hackerLol.printInfo();

		/*
		To solve these issues, modify the interval in the setAccountNum and setPin methods.
		*/

		hackerLol.setPassword("password") // The password is depicted as password + "SECURITY COMPRIMISED!!!" when it should just be password.
		hackerLol.printInfo();

		/*
		To solve this issue, modify the printInfo method to just include password when printing out account info.
		*/
	}
}
