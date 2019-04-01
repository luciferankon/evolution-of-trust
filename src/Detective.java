import java.util.ArrayList;
import java.util.List;

class Detective extends Player {
	private Player character;
	private List<Move> defaultMoves;

	Detective() {
		character = new Cheater();
		setDefaultMoves();
	}

	private void setDefaultMoves() {
		defaultMoves = new ArrayList<>();
		defaultMoves.add(Move.COOPERATE);
		defaultMoves.add(Move.CHEAT);
		defaultMoves.add(Move.COOPERATE);
		defaultMoves.add(Move.COOPERATE);
	}

	@Override
	Move makeMove() {
		if (defaultMoves.size() != 0) {
			Move move = defaultMoves.get(0);
			defaultMoves.remove(0);
			if (score != null && score < 0) {
				character = new CopyCat();
			}
			return move;
		}
		return character.makeMove();
	}

}
