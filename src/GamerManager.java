
public class GamerManager implements GamerServis {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kayýt edildi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kullanýcýnýn kaydý silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Güncellemeler kaydedildi.");
		
	}

}
