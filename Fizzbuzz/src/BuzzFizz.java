import java.util.Arrays;
import java.util.stream.IntStream;

//Return “fizz”, “buzz” or “fizzbuzz”.
//
//For a given natural number greater than zero return:
//
//“fizz” if the number is dividable by 3
//“buzz” if the number is dividable by 5
//“fizzbuzz” if the number is dividable by 15
//the same number if no other requirement is fulfilled


public class BuzzFizz {

	public static void main(String[] args) {
		int [] array = IntStream.rangeClosed(1, 10).toArray();
		
		System.out.println(Arrays.toString(array));
	}

}
