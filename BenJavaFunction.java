package ben.java.basic;

//display les noms des �tudiants de la Classe mStudent
public class BenJavaFunction {
	public static void main(String[] args) {
		mStudent[] students = new mStudent[] {
				new mStudent("Benoit","Plumat"),
				new mStudent("Lioneel","Valadou"),
				new mStudent("Tim","Legrand"),
				new mStudent("Joe","Lagaffe")
		};
		for (mStudent stud : students){
			stud.printFullName();
		};
	}
}