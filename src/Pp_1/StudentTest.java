package Pp_1;

public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(101,"2");
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구";

		studentLee.showStudentInfo();

	}
}
