/*
TNPG: Noble Narwhals | Roster: Nakib Abedin, Joker(ducky), Nicole Zhou, Ducky(ducky)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05


DISCOVERIES
1) When we create a method containing helloMsg, an instance variable, we received an error if we used static in the method header. Once we removed it, the code ran without error and completed its functionality.
2) You can define a variable without a method. This was similar to global variables in NetLogo and Python
UNRESOLVED QUESTIONS
1) Can anything take the place of "static" in the method header?
2) Was it possible to code this homework without removing "static" from the method header?

*/

public class BigSib {
  public String greet(String name){
        String value = (helloMsg + " " +  name);
	// The space between the helloMsg and name variables is done to make the formatting look better (more like English).
        return(value);
	}

  String helloMsg;
  
  public void setHelloMsg(String msg){
	helloMsg = msg;
	}
	

}


