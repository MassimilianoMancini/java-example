package examples;

public class HelloWorld {
	private String name;
	private int i;
	
	public HelloWorld(String name, int i) {
		this.name = name;
		this.i = i;
		System.out.println(this.name);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
