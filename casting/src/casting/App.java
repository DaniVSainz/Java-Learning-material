package casting;

public class App {

	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 123.3f;
		double doubleValue = 23.5;
		
		System.out.println(Byte.MAX_VALUE);
//		 This somewhat forces it in
		intValue = (int)longValue;
		System.out.println(intValue);
//		This works fine because it fits so we dont force it in
		doubleValue = intValue;
		// fits and dosent lose information
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
//		You have to be careful forcing a oversized value into a container it dosent fit in
		byteValue = (byte)128;
		System.out.println(byteValue);
//		See byteValue doesn't give us the correct value anymore
//		You cant cast from a String to a int
	}

}
