
public class app {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Car car1 = new Car();
//		It can inherit the class machine methods but you also can ovveride them
//		start is overrided but stop is still the parents method
		car1.start();
		car1.stop();
		car1.wipeWindshield();
		car1.showInfo();
	}

}
