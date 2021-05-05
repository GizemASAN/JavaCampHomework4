
public class GameManager implements GameServis {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu alýndý");
		
	}

	@Override
	public void sell(Game game) {
		System.out.println(game.getGameName() + " oyunu satýldý");
		
	}

}
