package org.sample.bullscows;

public class Engine {
	/**
	 * Generates hint sequence. It should fit the following requirements:
	 * 1) The sequence must contain only 4 characters
	 * 2) Each character must be the number
	 * 3) Each character must be unique
	 * @return generated hint string
	 */
	public String generateHint() {
		// TODO: Add implementation
		return "1234";
	}
	/**
	 * Verifies that entered sequence of characters are matching the hint format.
	 * Sequence is considered as valid if it fits the following criteria:
	 * 1) The sequence must contain only 4 characters
	 * 2) Each character must be the number
	 * 3) Each character must be unique
	 * @param guess the character sequence to check validity for
	 * @return true if input sequence matches validity criteria. False otherwise
	 */
	public boolean isValid(String guess) {
		// TODO: Add implementation
		return true;
	}
	/**
	 * Evaluates how sequence represented by guess parameter matches hint.
	 * The result is coded as the pair of bulls and cows. Final value is represented as
	 * the number of bulls and cows. 
	 * 
	 * Bull is qualified if some certain character in the guess sequence equals to the
	 * character at the same position in the hint. 
	 * 
	 * If hint sequence has some character from the guess sequence but at different position
	 * it counts as a cow.
	 * 
	 * So, the final result is the sum of bulls and cows. Since the hint and guess sequence
	 * length is limited to 4, the sum of bulls and cows cannot be bigger than 4.
	 * 
	 * Valuation examples:
	 * 
	 * 1)
	 * Hint:  4278
	 * Guess: 1234
	 * Result: 1 bull 1 cow
	 * Explanation: the number 2 is on the second position both in the hint and guess. It makes +1 bull.
	 * The number 4 at the last position in guess sequence definitely exists in hint but at different index
	 * which makes +1 cow. Other numbers do not match 
	 *  
	 * 2)
	 * Hint:  5793
	 * Guess: 7593
	 * Result: 2 bulls and 2 cows
	 * Explanation: numbers 9 and 3 were guessed properly and they are placed at the same position as in hint.
	 * It makes +2 bulls. At the same time 5 and 7 exist in hint but at different positions which makes +2 cows
	 * 
	 * 3)
	 * Hint:  1234
	 * Guess: 5678
	 * Result: 0 bulls 0 cows
	 * Explanation: nothing matches
	 * 
	 * 4)
	 * Hint:  6397
	 * Guess: 6397
	 * Result: 4 bulls 0 cows
	 * Explanation: the guess is completely matching the hint. All 4 numbers are at proper positions.
	 * 
	 * @param hint
	 * @param guess
	 * @return
	 */
	public GuessResult evaluate(String hint, String guess) {
		// TODO: Add implementation
		return new GuessResult();
	} 
}
