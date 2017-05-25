// WHen we implement a interfance it forces us to have all the methods from the interface in this class.
// we can use eclipse to autofill it 
public class Machine implements Info {
	private int id = 7;
	
	public void startMachine(){
		System.out.println("Machine started");
	}
	
	@Override
	public void showInfo() {
		System.out.println("Machine id is: " + id );
	}
	
}
