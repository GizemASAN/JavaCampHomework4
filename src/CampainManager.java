
public class CampainManager implements CampainServis {

	@Override
	public void add(Campain campain) {
		System.out.println(campain.getCampainName() + " kampanyas� eklendi.");
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println(campain.getCampainName() + " kampanyas� silindi.");
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println(campain.getCampainName()+ " kampanyas� g�ncellendi.");
		
	}

}
