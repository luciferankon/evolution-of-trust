import java.util.ArrayList;
import java.util.List;

class Game {
	private List<Player> players;
	private List<Move> moves;
	private Machine machine;

	Game(List<Player> players) {
		this.players = players;
		moves = new ArrayList<>();
		machine = new Machine();
	}

	List<Integer> makeMove() {
		moves.clear();
		for (Player player : players) {
			moves.add(player.makeMove());
		}
		return machine.givePoints(moves, players);
	}
}
