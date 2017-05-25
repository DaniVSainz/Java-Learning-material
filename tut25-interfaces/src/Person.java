
public class Person implements Info {
	private String name;
//	used right click source generate constructor using fields to generate this
	public Person(String name) {
		super();
		this.name = name;
	}

	public void greet(){
		System.out.println("Hello there");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
	}
}
