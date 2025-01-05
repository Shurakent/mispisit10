public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	@Override
	public String toString() {
		return "ResearchAssociate{" +
				"fieldOfStudy='" + fieldOfStudy + '\'' +
				", ssNo=" + ssNo +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}