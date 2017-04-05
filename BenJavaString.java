package ben.java.basic;

public class BenJavaString {
	public static void main(String args[]) {
		//simple string
		String mystring = "Bonjour Ben !";
		System.out.println(mystring);
		
		//array string
		char[] helloben = {'b','e','n'};
		String hellobenstring = new String(helloben);
		System.out.println(hellobenstring);
		
		//longueur d'un string
		int len = hellobenstring.length() ;
		System.out.println("la longueur de ben est " + len);
		
		//concatenate de strings
		String mystr1 = "coucou ";
		String mystr2 = "benneke !";
		System.out.println(mystr1.concat(mystr2));  //display les deux str1-2 concatenated
		
		//String.format permet de créer un format de string avec des variables
		String mystrformatted;
		double mf = 26.62;
		int mi = 4;
		String ms = "ben";
		mystrformatted = String.format("la valeur d'un float est %1$f, tandis qu'un entier est %2$d, et le sring est %3$s !", mf, mi, ms);
		System.out.println(mystrformatted);
	}
}
