import java.util.*;

class Machine {
	private List<Integer> scores;
	private Map<List<Move>, List<Integer>> pointsDetails;

	Machine() {
		scores = new ArrayList<>(Arrays.asList(0, 0));
		setPointMatrix();
	}

	private void setPointMatrix() {
		pointsDetails = new HashMap<>();
		pointsDetails.put(List.of(Move.CHEAT, Move.CHEAT), List.of(0, 0));
		pointsDetails.put(List.of(Move.COOPERATE, Move.COOPERATE), List.of(2, 2));
		pointsDetails.put(List.of(Move.CHEAT, Move.COOPERATE), List.of(3, -1));
		pointsDetails.put(List.of(Move.COOPERATE, Move.CHEAT), List.of(-1, 3));
	}

	List<Integer> getPoints(List<Move> moves, List<Player> players) {
		List<Integer> points = pointsDetails.get(moves);
		players.get(0).setScore(points.get(0));
		players.get(1).setScore(points.get(1));
		scores.set(0, scores.get(0) + points.get(0));
		scores.set(1, scores.get(1) + points.get(1));
		return scores;
	}
}
