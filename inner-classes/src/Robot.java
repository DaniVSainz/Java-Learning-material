
public class Robot {
	private int id;

	class Brain {
		public void think(){
			System.out.println("Robot" + id + " Is thinking");
		}
	}
	
	
	public Robot(int id) {
		super();
		this.id = id;
	}
	
	public void start(){
		System.out.println("Starting Robot " + id);
		
		Brain brain = new Brain();
		brain.think();
	}
	
	
}
