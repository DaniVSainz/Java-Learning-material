
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mach1 = new Machine();
		mach1.startMachine();
		
		Info info1 = new Machine();
//		that works but we would only have info's machine methods not the parent machiens methods as well 
		info1.showInfo();
		
		Info info2 = new Person("bobby");
		
		info2.showInfo();
//		dosent have access to .greet();
		
		outputInfo(mach1);
	}	
	
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
