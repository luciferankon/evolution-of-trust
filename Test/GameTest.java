import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

	@Test
	void shouldReturnThePointsIfBothPlayersAreCoolPerson() {
		Player coolPerson1 = new CoolPerson();
		Player coolPerson2 = new CoolPerson();
		List<Player> players = new ArrayList<>(Arrays.asList(coolPerson1, coolPerson2));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(2, 2), game.makeMove());
		assertEquals(List.of(4, 4), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfOnePlayerIsCoolAndOtherIsCheater() {
		Player coolPerson = new CoolPerson();
		Player cheater = new Cheater();
		List<Player> players = new ArrayList<>(Arrays.asList(coolPerson, cheater));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(-1, 3), game.makeMove());
		assertEquals(List.of(-2, 6), game.makeMove());
		assertEquals(List.of(-3, 9), game.makeMove());
		assertEquals(List.of(-4, 12), game.makeMove());
		assertEquals(List.of(-5, 15), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfBothPlayerAreCheater() {
		Player cheater1 = new Cheater();
		Player cheater2 = new Cheater();
		List<Player> players = new ArrayList<>(Arrays.asList(cheater1, cheater2));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(0, 0), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfOnePlayerIsCoolAndOtherIsCopycat() {
		Player coolPerson = new CoolPerson();
		Player copyCat = new CopyCat();
		List<Player> players = new ArrayList<>(Arrays.asList(coolPerson, copyCat));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(2, 2), game.makeMove());
		assertEquals(List.of(4, 4), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfOnePlayerIsCopyCatAndOtherIsCheater() {
		Player copyCat = new CopyCat();
		Player cheater = new Cheater();
		List<Player> players = new ArrayList<>(Arrays.asList(copyCat, cheater));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(-1, 3), game.makeMove());
		assertEquals(List.of(-1, 3), game.makeMove());
		assertEquals(List.of(-1, 3), game.makeMove());
		assertEquals(List.of(-1, 3), game.makeMove());
		assertEquals(List.of(-1, 3), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfOnePlayerIsCopycatAndOtherIsGrudger() {
		Player grudger = new Grudger();
		Player copyCat = new CopyCat();
		List<Player> players = new ArrayList<>(Arrays.asList(copyCat, grudger));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(2, 2), game.makeMove());
		assertEquals(List.of(4, 4), game.makeMove());
		assertEquals(List.of(6, 6), game.makeMove());
		assertEquals(List.of(8, 8), game.makeMove());
		assertEquals(List.of(10, 10), game.makeMove());
	}

	@Test
	void shouldReturnThePointsIfOnePlayerIsCopycatAndOtherIsDetective() {
		Player copyCat = new CopyCat();
		Detective detective = new Detective();
		List<Player> players = new ArrayList<>(Arrays.asList(copyCat, detective));
		Machine machine = new Machine();
		Game game = new Game(players, machine);
		assertEquals(List.of(2, 2), game.makeMove());
		assertEquals(List.of(1, 5), game.makeMove());
		assertEquals(List.of(4, 4), game.makeMove());
		assertEquals(List.of(6, 6), game.makeMove());
		assertEquals(List.of(8, 8), game.makeMove());
	}
}