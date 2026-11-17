package fizzbuzz;

public class Game {
	
	private int round = 1;
	
	public String next() {
		String answer = "" + round;
		round++;
		return answer;
	}

}
