
class Machine {
	public void start(){
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	@Override
	public void start(){
		System.out.println("Camera started");
	}
	public void snap(){
		System.out.println("Photo started");
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		
		camera1.start();
		camera1.snap();
		
		//Upcasting
		
		Machine machine2 = camera1;
		machine2.start();
//		machine2.snap(); this dosent work, the variables knows what methods are available.
		
		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3; 
		camera2.snap();
		
		// This dosent work ---runtime error 
		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
//		camera3.start();
//		camera3.snap();
	}

}
