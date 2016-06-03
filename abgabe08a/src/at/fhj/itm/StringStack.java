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
	
	public StringStack(int size) {
		data = new String[size];
	}
	
	@Override
	public boolean isEmpty() {
		return offset <= -1;
	}

	@Override
	public void push(String item) {
		if(offset + 1 >= data.length) {
			System.out.println("Stack is full!");
			return;
		}
		
		data[++offset] = item;
	}

	@Override
	public String pop() {
		if(isEmpty())
			return "Stack is empty!";
		
		return data[offset--];
	}
}
