/*
TNPG: Noble Narwhals | Roster: Nakib Abedin, Joker(ducky), Nicole Zhou, Ducky(ducky)
APCS
HW13 -- Whee do BigSibs come from?
2021-10-06


DISCOVERIES
1) We found out what a constructor is.
2) The constructor essentially did what we did with the setHelloMsg method in a much more elegant manner.
3) The variable should still be defined outside of the constructor if we plan on assigning a value inside of the constructor. When we did not do so, it returned an error.

UNRESOLVED QUESTIONS
1) Were we meant to know what a constructor was beforehand?
2) How do we make the instance variable private? I tried using typing in private before it and it returned an error.

*/

public class BigSib {

  public String greet(String name){
        String value = (helloMsg + " " +  name);
	// The space between the helloMsg and name variables is done to make the formatting look better (more like English).
        return(value);
	}

  String helloMsg;

  public BigSib(String msg) {
	 helloMsg = msg;
	}

  public void setHelloMsg(String msg){
	BigSib helloMsg = new BigSib(msg);
	}
}


