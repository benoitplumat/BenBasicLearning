package ben.java.basic;

//import la Lib Date
import java.util.Date;

public class BenJavaDate {
	public static void main(String args[]) {
		//new Date instance creation
		Date myDate = new Date();
		
		//diplay la date du jour
		System.out.println(myDate.toString());
		//diplay le mois
		int myMilisecond = myDate.hashCode();
		System.out.println("date() en hashcode = " + myMilisecond); //via hascode method
		//display en format dd/mm/yyyy
		String strDate = String.format("%s %td/%<tm/%<tY %<tR:%<tS", "Nous sommes en", myDate);  //format en dd/mm/yyyy
		System.out.printf(strDate);
		System.out.println();
		//display en fomat jj mois aaaa -  avec conversion en langage local
		String frDate = String.format("%s %td %<tB %<tY", "Nous sommes le", myDate);
		System.out.printf(frDate); // 1$ indicates the format of the first arugment, 2$ the second argument ...
		System.out.println();
		System.out.printf("%s %tB %<te, %<tY %s", "Due date:", myDate, "!"); // < indicates the preceding argument format has to be used again
		//System.out.println("le mois = " + myDate.);
	}
}