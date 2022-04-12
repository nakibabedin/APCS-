/*
(P)BNJ -- Nakib Abedin + Jefford Shau + Brian Li
APCS pd07
HW89 --  Queue Two Ways
2022-04-11
time spent: 0.1 hr + class time

DISCO
1) Passing through the functionality of ArrayList and LinkedList to Queue makes coding the Wrapper Class for ArrayList and LinkedList much easier.
2) The encapsulation diagram helped us identify the time complexity of each method.

QCC:
1) How can we make AlQueue have constant runtime for both enqueue and dequeue?
*/

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR>{
  private ArrayList<QUASAR> al;

  public ALQueue(){
    al = new ArrayList<QUASAR>();
  }

  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
    if (!al.isEmpty()){
      return al.remove(0);
    }
    else { return null; }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    al.add(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return al.isEmpty();
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    if (!al.isEmpty()){
      return al.get(0);
    }
    else { return null; }
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~
}
