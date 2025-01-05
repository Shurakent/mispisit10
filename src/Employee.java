public abstract class Employee {

	public int ssNo;
	public String name;
	public String email;
	public static int counter;

	public Employee(int ssNo, String name, String email) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
	}


	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
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

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Employee.counter = counter;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"ssNo=" + ssNo +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}

}