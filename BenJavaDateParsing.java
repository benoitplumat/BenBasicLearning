package ben.java.basic;

//import libraries
import java.util.Date;
import java.text.*;

//convertir une date sous forme de string en une date en format Date
public class BenJavaDateParsing {
	public static void main(String args[]) {
		//new Date instance creation
		Date mybirthdate = new Date();
		SimpleDateFormat mydateformat  = new SimpleDateFormat ("d/M/y");
		String mybirth = args.length == 0 ? "26/04/1962" : args[0]; //mybirth est un String
		System.out.println(mybirthdate.toString()); //Date du jour avant le Parsing
		System.out.print("ma date de naissance en format texte est " + mybirth);
		try {
			mybirthdate = mydateformat.parse(mybirth);
			System.out.print(" et en format date generique : ");
			System.out.print(mybirthdate);
		}catch (ParseException e) {
			System.out.println(); //aller à la ligne
			System.out.println("Unparseable format " + mydateformat);
		}
	}
}
