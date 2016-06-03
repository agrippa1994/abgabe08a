package at.fhj.itm;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 *  
 * @see Stack
 */
public class StringStack implements Stack
{
	private String[] data;
	private int offset = -1;
	
	/**
	 * Initializes Stack
	 * @param size Number of elements
	 */
	public StringStack(int size) {
		data = new String[size];
	}

	/**
	 * Checks if Stack is empty
	 * @return true if empty otherwise false
	 */
	@Override
	public boolean isEmpty() {
		return offset <= -1;
	}

	@Override
	/**
	 * Pushes element onto the stack
	 * @param item String element
	 */
	public void push(String item) {
		if(offset + 1 >= data.length) {
			System.out.println("Stack is full!");
			return;
		}
		
		data[++offset] = item;
	}

	/**
	 * Pops element from stack
	 */
	@Override
	public String pop() {
		if(isEmpty())
			return "Stack is empty!";
		
		return data[offset--];
	}
}
