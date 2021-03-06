package Lecture11;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		// only array created, no student created yet.
		Student[] students = new Student[100];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i + "th");
			System.out.println(Student.GeNumOfStudents());

		}

		// Able to access static field but cant change the value
		System.out.println(Student.MAX_STUDENTS);
		// Student.MAX_STUDENTS=2000;

		// students[250].rollNo = 10;
		System.out.println(students[25].rollNo);
		
		System.out.println(students[25].getName());
		students[25].setName("ABC"); // safe here because of exception.
		System.out.println(students[25].getName());

		students[25].ANonStaticFunction();
		//students[25].AStaticFunction();
		Student.AStaticFunction();
//
		students[25].setUniformColor("Blue");
		System.out.println(students[35].getUniformColor());
	}
}
