package at.fhj.itm;

public class StackTester {

	public static void main(String[] args) {
		StringStack stack = new StringStack(3);
		stack.push("Hallo");
		stack.push("Welt");
		stack.push("Test");
		
		for(int i = 0; i < 3; i++)
			System.out.println(stack.pop());
	}

}
