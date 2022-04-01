public class NodeQueue<QUASAR> implements Queue<QUASAR> {

    LLNode<QUASAR> _front;

  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~






    /*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a QUASAR
 *****************************************************/

private class LLNode<QUASAR>
{
    //instance vars
    private QUASAR _cargo;    //cargo may only be of type QUASAR
    private LLNode _nextNode; //pointer to next LLNode

    // constructor -- initializes instance vars
    public LLNode( QUASAR value, LLNode next ) {
	_cargo = value;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo ) {
	QUASAR foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public LLNode setNext( LLNode newNext ) {
	LLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

}//end class LLNode
}
