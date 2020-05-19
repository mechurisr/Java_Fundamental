package practiceNote;

public class PracticeAdmin {
	private String user;
	private String addr1;
	private int postcode;

	public PracticeAdmin() {
		super();

	}

	public PracticeAdmin(String user, String addr1, int postcode) {
		super();
		this.user = user;
		this.addr1 = addr1;
		this.postcode = postcode;

	}

	public void setUser(String user) {
		this.user = user;
	}
	public String getUser() {
		return user;
	}
	
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr1() {
		return addr1;
	}
	
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public int getPostcode() {
		return postcode;
	}
}
