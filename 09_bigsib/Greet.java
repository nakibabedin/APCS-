/*
 TNPG: LAN | Nakib Abedin, Alif Rahman, Lior Polischouk
 APCS
 HW08 -- Refactor Freshie Zero
 2021-09-30

Discoveries:
1) You can call a method within another method.
2) It seems like you need to have an argument to call a method within another method. It seems like you can't leave the argument section blank.
3) From our obserations and experimentation, it seems like you can not define a method within another method. To have methodY inside methodX methodY needs to be defined in the same class and then it can be called inside method X

Unresolved Questions:
1) Do you need to have arguments when calling a function in Java? If not, why did it return an error when we tried to call greet() without and argument?
2) Is it possible to define a method within a method?
*/

public class Greet {
  public static void main (String [] args){
	BigSib.greet("Nakib");
	BigSib.greet("Alif");
	BigSib.greet("Lior");
	}
  public static void greet(String name){
	System.out.println("Why, hello there, " + name + ". How do you do?");
	}
}

