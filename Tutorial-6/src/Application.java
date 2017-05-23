
public class Application {
	public static void main(String[] args) {
		
		int myInt = 20;
		
		if(myInt < 2) {
			System.out.println("something");
		}
		else if(myInt > 2){
			System.out.println("Larger than 2");
		}else{
			System.out.println("No its false ");
		}
		
		int loop = 0;
		while(loop < 5){
			System.out.println("Looping" + loop);
			loop++;
		}
	}

}
