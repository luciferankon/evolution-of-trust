abstract class Player {
	Integer score;

	abstract Move makeMove();

	void setScore(int score) {
		this.score = score;
	}
}
