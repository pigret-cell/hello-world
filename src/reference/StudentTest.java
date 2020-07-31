package reference;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames;
		studentJames = new Student(100,"James");
		studentJames.setKorea("국어",100);
		studentJames.setMath("수학",100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setKorea("국어", 60);
		studentTomas.setMath("수학", 50);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
