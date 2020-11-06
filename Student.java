//*******************************************************************
// Student
// This class can be used to create a Student object having a name, an email, and a major
//*******************************************************************
public class Student {

	private String name;
	private String email;
	private String major;
	private Integer graduationYear;

	public Student(String name, String email, String major, Integer graduationYear){
		setName(name);
		setEmail(email);
		setMajor(major);
		setGraduationYear(graduationYear);
	}
	
	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}
	
	public Integer getGraduationYear() {
		return graduationYear;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return "Name: [" + this.name + "], Email: [" + this.email + "], Major: [" + this.major + "], Graduation Year: [" + this.graduationYear + "]";
	}
}