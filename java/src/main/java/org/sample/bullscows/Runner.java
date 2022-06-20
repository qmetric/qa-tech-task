package org.sample.bullscows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		Engine engine = new Engine();
		String hint = engine.generateHint();
		String input = "";
		do {
			input = reader.readLine();
			System.out.println("You've entered: " + input);
			if (input.equalsIgnoreCase("hint")) {
				System.out.println("Hint is: " + hint);
				continue;
			}
			if (!input.equalsIgnoreCase("exit") && !engine.isValid(input)) {
				System.err.println("The input '" + input + "' doesn't match expected pattern");
				continue;
			}
			GuessResult result = engine.evaluate(hint, input);
			System.out.println(String.format("Result: %d bull(s) %d cow(s)", result.getBulls(), result.getCows()));
			if (result.getBulls() == 4) {
				System.out.println("You Won!!!");
				break;
			}
		} while(!input.equalsIgnoreCase("exit"));

	}

}
