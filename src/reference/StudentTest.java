package reference;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames;
		studentJames = new Student(100,"James");
		studentJames.setKorea("����",100);
		studentJames.setMath("����",100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setKorea("����", 60);
		studentTomas.setMath("����", 50);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
