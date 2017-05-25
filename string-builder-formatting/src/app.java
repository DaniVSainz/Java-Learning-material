public class app {

	public static void main(String[] args) {
		//This is inefficient
//		String info = " ";
//		info += "Something";
//		info += " ";
//		info += "More somethings";
//		System.out.println(info);
		
//		Saves memory doing this way.
		StringBuilder sb = new StringBuilder("") ;
		sb.append("My name is something");
		sb.append("WHITEEESPACE");
		sb.append("Something");
		System.out.println(sb);
		
//		the 2after% and before d signifies the space setting for the string interpolation
//		%s = string
		
		for (int i = 0; i< 20; i++){
			System.out.printf("%2d: some text here\n",i);
		}
//		the .2 after % signifies how many places for decimals, it also rounds values for us
		System.out.printf("Total value: %.2f\n", 5.687);
//		the number before . signifies width of string interpolation(useful for formatting tables etc)
		System.out.printf("Total value: %5.1f\n", 5.687);

	}

}
