
public class Campain {
	
	
	private String campainName;
	private int discount;
	
	public Campain(String campainName, int discount) {
		super();
		this.campainName = campainName;
		this.discount = discount;
		
		
	}

	
	public String getCampainName() {
		return campainName;
	}

	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
