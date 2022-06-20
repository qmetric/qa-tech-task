package org.sample.bullscows;

public class GuessResult {
	private int bulls;
	private int cows;
	
	public GuessResult() {
		bulls = 0;
		cows = 0;
	}

	public GuessResult(int bulls, int cows) {
		super();
		this.bulls = bulls;
		this.cows = cows;
	}

	public int getBulls() {
		return bulls;
	}

	public void setBulls(int bulls) {
		this.bulls = bulls;
	}

	public int getCows() {
		return cows;
	}

	public void setCows(int cows) {
		this.cows = cows;
	}
	
}
