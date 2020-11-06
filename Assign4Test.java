//*******************************************************************
// Assign4Test
// This class contains the main method for CS-176L Assignment 4
//*******************************************************************
public class Assign4Test {

	public static void main(String[] args) {
		Student aj = new Student("Abdulmuhsin J. Al-Kandari", "s0936669@monmouth.edu", "SE", 2022);
		Student justin = new Student("Justin R. Schlemm", "s0898474@monmouth.edu", "SE", 2022);
		Student mary = new Student("Mary F. Menges", "s1012284@monmouth.edu", "SE", 2022);

		Student[] studentArray = {aj, justin, mary};
		StudentList myStudentList = new StudentList(studentArray);
		
		System.out.println(myStudentList.getAllStudentInfo());
		myStudentList.updateStudentGraduationYear("s0936669@monmouth.edu", 2021);
		System.out.println(myStudentList.getAllStudentInfo());
	}
}