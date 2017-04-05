package ben.java.basic;

public class mStudent {
		private String mFirstName;
		private String mLastName;
		public mStudent (String firstName, String lastName) {
			this.mFirstName = firstName;
			this.mLastName = lastName;
		}
		//function (method) qui imprime le nom complet de l'étudiant firstName - lastName
		public void printFullName() {
			System.out.println(this.mFirstName + " " + this.mLastName);
		}
	}