
public class App {

	public static void main(String[] args) {
		int[]  numArray= new int[100];	
		
		for ( int i=0;i < 100;++i ){
			numArray[i]=i;
		}
		
		
		for (int i = 0; i < numArray.length ; i++){
			
			if( i != 0 ){
				if (numArray[i] % 5 == 0 && numArray[i] % 3 == 0){
					System.out.println(numArray[i] + "FizzBuzz");
				} else if (numArray[i] % 5 == 0) {
					System.out.println(numArray[i] + "Buzz");
				} else if (numArray[i] % 3 == 0) {
					System.out.println(numArray[i]+ "Fizz");
				}
			}

		}
	}

}
