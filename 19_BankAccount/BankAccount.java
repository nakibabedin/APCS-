/**
   TNPG: NAW Fam (Alif Rahman, Nakib Abedin)
   APCS pd06
   HW18 -- building a more meaningful class
   2021-10-18
   
   Discoveries:
   1) There is no keyword "And" in Java. We need to use "&".
   2) If a method will return a boolean value, its returnType needs to be boolean
   3) A nested if statement can accomplish the same functionality as the & keyword
   
   QCC:
   1) Why do each of the set<Var> methods return the old value of the variables? Is there a reason why this is the case? Wouldn't it make more sense to return the new values?

   Tasks Accomplished:
   instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance
   and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if ((short) newPin >= 1000 & (short) newPin < 9999){
    	pin = newPin;
    	return oldPin;
    } else {
	pin = 9999;
	System.out.println("The pin number should be exactly 4 digits");
    	return oldPin;  
    }
  }

  public int setAcctNum( int newAcctNum ) {
    	int oldAcctNum = acctNum;
	int newAcctNumBoolean = newAcctNum;
    	if (newAcctNumBoolean >= 100000000){
    		if (newAcctNumBoolean < 999999999){
			acctNum = newAcctNum;
    			return oldAcctNum;
		}else {
			System.out.println ("Account Number out of bounds. Must be 9 digits.");
			acctNum =  999999999;
			return oldAcctNum;
		}
		
	}else {
		System.out.println("Account Number out of bounds. Must be 9 digits.");
		acctNum =  999999999;
		return oldAcctNum;

	}
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if(withdrawAmount <= balance){
	balance = balance - withdrawAmount;
	return true;
    }else {
	System.out.println("ERROR: Nah Fam, You don't got enough dough");
	return false;	
	}
  }

  public boolean authenticate(int acctNumInfo, String pswdInfo){
	if (acctNum == acctNumInfo & passwd == pswdInfo){
		System.out.println("Account Number and Password Correct");
		return true;
	}else {
		System.out.println("Account Number or Password incorrect");
		return false;	
	} 
	}

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
    BankAccount ba = new BankAccount();
    ba.setName("Lucid");
    ba.setPasswd("Lucid123");
    ba.setAcctNum(1333666999);
    ba.setPin((short) 12345);
    ba.setBalance(235.12);
    ba.deposit(10);
    ba.withdraw(1000);
    ba.authenticate(1333666999, "Lucid123");
    System.out.println(ba.toString());
  }//end main()

}//end class BankAccount
