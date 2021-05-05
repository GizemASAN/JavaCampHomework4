
public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName("Gizem");
		gamer1.setGamerBirthYear(1997);
		gamer1.setId("10000000000");
		
		
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("Resident Evil 8");
		game1.setGamePrice(359);
		
		
		Campain campain1 = new Campain("Yeni Üyelik", 20);
		
		GamerManager gamerManager1 = new GamerManager();
		gamerManager1.add(gamer1);
		gamerManager1.delete(gamer1);
		gamerManager1.update(gamer1);
		
		
		CampainManager campainManager1 = new CampainManager();
		campainManager1.add(campain1);
		campainManager1.delete(campain1);
		campainManager1.update(campain1);
		
		
		GameManager gamemanager1 = new GameManager();
		gamemanager1.add(game1);
		gamemanager1.sell(game1);

	
	
	}
	
}
