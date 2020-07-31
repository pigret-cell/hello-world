package Pp_1;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student(int id,String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		Student studentLee = new Student(101,"�̼��� ");
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		Student studentKim = new Student(101,"������");
		studentKim.address = "�̱� ��ȣ��";
	
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
