
public class GamerManager implements GamerServis {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kay�t edildi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kullan�c�n�n kayd� silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("G�ncellemeler kaydedildi.");
		
	}

}
