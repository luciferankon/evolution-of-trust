class Grudger extends Player {

	private Move defaultMove = Move.COOPERATE;

	@Override
	Move makeMove() {
		if (score != null && score < 0) defaultMove = Move.CHEAT;
		return defaultMove;
	}
}
