package rmuti.LAB41;


public class TestArrayListStack {
	
	public static void main(String[]args) {
		ArrayListStrack stack = new ArrayListStrack();
		stack.push("macos");
		stack.push("linux");
		stack.push("window");
		System.out.println(stack);
		
		String data = (String)stack.pop();
		System.out.println(stack);
	}


}