class Machine {
	String name;
	private int code;
	public Machine() {
		System.out.println("Initialized a new machine");
	}
	public Machine(String name){
		this.name = name; 
		System.out.println("2nd constructor");
	}
	public Machine(String name,int code){
		this.name = name;
		this.code = code;
		System.out.println("Third constructor running");
	}
}


public class app {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Dani");
		
	}

}
