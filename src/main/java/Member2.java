
public class Member2 {
	private String name,email,number,message;

	
	
	public Member2() {
		super();
	}

	public Member2(String name,String email,String number, String message ) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.message= message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}


