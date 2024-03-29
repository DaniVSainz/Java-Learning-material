//Object class is parent of frog class so it inherets all the methods.
class Frog {
//	Use of to string method is to create a string representation of our object
//	without it we get object id like in ruby
	private int id;
	private String name;
	
//	Cnstructor method, like initialize within class in ruby
	public Frog(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return String.format("%-4d: %s",id,name);
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
////		return id + ": " + name; this is inneficient
////		every plus between strings creates a new string and uses memory
//		return sb.toString();

	}
}

public class app {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7,"Prince frog");
		Frog frog2 = new Frog(8,"Frog 8");

		System.out.println(frog1);
		System.out.println(frog2);
	}

}
