import java.util.ArrayList;
import java.util.List;

class Game {
	private List<Player> players;
	private List<Move> moves;
	private Machine machine;

	Game(List<Player> players,Machine machine) {
		this.players = players;
		moves = new ArrayList<>();
		this.machine = machine;
	}

	List<Integer> makeMove() {
		moves.clear();
		for (Player player : players) {
			moves.add(player.makeMove());
		}
		return machine.getPoints(moves, players);
	}
}
