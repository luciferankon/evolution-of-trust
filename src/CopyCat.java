public class CopyCat extends Player {

	@Override
	public Move makeMove() {
		if (score != null && score <= 0) return Move.CHEAT;
		return Move.COOPERATE;
	}
}
