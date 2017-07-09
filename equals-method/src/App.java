
class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person(5,"bob");
		Person person2 = new Person(5,"bob");
		
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1 == value2);
		
		Integer number1 = 6;
		Integer number2 = 6;
		
//		== checks if they're pointing at the same object not if same value always
//		double for example creates new objects but integer didnt
		System.out.println(number1==number2);
		
		String text1 = "hey";
		String text2 = "hey";
		
//		This does equal two and they point at the same object.Just use == to compara
//		if they point at the same object not value
		System.out.println(text1==text2);
	}
	
	
}