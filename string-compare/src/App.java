import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = scan.nextInt();
		scan.close();
		int strLength = str.length();
		String minLex = str.substring(0,num);
		String maxLex = str.substring(0,num);

        
		for (int i = 0; i < strLength-num+1; i++) {
			if ( maxLex.compareTo(str.substring(i,i+num)) < 0 ){
				maxLex = str.substring(i,i+num);
			}
			else if (minLex.compareTo(str.substring(i,i+num)) > 0){
				minLex = str.substring(i,i+num);
			}
		}

		System.out.println(minLex);
		System.out.println(maxLex);

	}

}
