/*
TNPG: Noble Narwhals | Roster: Nakib Abedin, Joker(ducky), Nicole Zhou, Ducky(ducky)
APCS
HW14 -- Customize your creation
2021-10-07

DISCOVERIES
1) You can have a contructor assing the same values to each instance of a variable
2) We better understand what happens when we use the "new" operator. 
UNRESOLVED QUESTIONS
1) We were able to complete the homework without having to create a second constructor. Did we skip steps?
*/




public class Greet {

	public static void main(String[] args) {
		String greeting;
		BigSib richard = new BigSib();
		BigSib grizz = new BigSib();
		BigSib dotCom = new BigSib();
		BigSib tracy = new BigSib();
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		greeting = tracy.greet("Dr. Spaceman");
		System.out.println(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.out.println(greeting);
		greeting = dotCom.greet("mom");
		System.out.println(greeting);

	}
}
