
public class Validations implements ValidationGamer {

	@Override
	public boolean checkGamer(Gamer gamer) {

		if(gamer.getFirstName() != null && gamer.getLastName() != null && gamer.getId().length() == 11) {
			return true;
	}
	return false;
}
}