package examples;

public class HelloWorld {
	
	private static HelloMessage message = new HelloMessage();

	public static void main(String[] args) {
		System.out.println(message.getMessage());
		
	}
}
