
public class GameManager implements GameServis {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu al�nd�");
		
	}

	@Override
	public void sell(Game game) {
		System.out.println(game.getGameName() + " oyunu sat�ld�");
		
	}

}
