package classProblems;

interface College{
	void cashing();
	void document();
}

interface Department{
	void papers();
}

interface exam{
	void marks();
}
class stafff implements College, Department,exam{
	public void cashing() {
		System.out.println("Cashing");
	}
	public void document(){
		System.out.println("Document");
		
	}
	public void papers() {
		System.out.println("Papers");
		
	}
	public void marks() {

		System.out.println("Marks");
	}
}
public class abstractionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stafff s = new stafff();
		s.cashing();
		s.document();
		s.papers();
		s.marks();
		
	}

}