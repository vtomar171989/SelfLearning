public class Test {

	public static void main(String[] args) {
	
       Testing.show();
       Testing t= new Testing();
       t.display();
	}

	static void show()
	{
		
		System.out.println("I am showing");
	}
	
	void display()
	{
		
		System.out.println("I am displaying");
		System.out.println("I am displaying again");
		
	}
}
