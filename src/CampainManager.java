
public class CampainManager implements CampainServis {

	@Override
	public void add(Campain campain) {
		System.out.println(campain.getCampainName() + " kampanyasý eklendi.");
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println(campain.getCampainName() + " kampanyasý silindi.");
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println(campain.getCampainName()+ " kampanyasý güncellendi.");
		
	}

}
