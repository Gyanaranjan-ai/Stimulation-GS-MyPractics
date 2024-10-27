package java8;

import java.util.function.Function;

public class FindthelengthuisngLambda {
	public static void main(String[] args) {
        String s = "gyana";

        // Lambda to find the length of the string
        Function<String, Integer> stringLength = str -> str.length();

        // Get the length of the string
        int length = stringLength.apply(s);

        // Print the length
        System.out.println("Length of the string: " + length);
    }

}
