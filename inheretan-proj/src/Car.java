//extends mean car is a child of Machine class, //inherits from machine or is a machine
public class Car extends Machine  {
	
	
	
//	@Override is a annotation, but it's also a classname
//	If you put this class it will check that the method below is actually being overwritten
//	and check spelling etc and that it exists.Usefull to be certain you overwrote a parent method.
	
// Dont try to override variables just methods because the results will be terrible	
	@Override
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindshield(){
		System.out.println("Wiping windshield");
	}
	
	public void showInfo(){
//		System.out.println("Car name:" + name); will not work because machine name was private
		System.out.println("Car name:" + name);
	}
}
