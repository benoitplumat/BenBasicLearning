package ben.java.basic;

/**
 * @author QVP6200 - Benoit Plumat
 * Exercices d'apprentissage Java - http://www.learnjavaonline.org
 * Les Arrays et Loops For While Break Continue
 */

public class BenJavaArray {

	public static void main(String[] args) {
		int j = 3;
		// Tests sur les Arrays
		int[] myArrayInt;					//Declare
		myArrayInt = new int[10];			//Create an array of 10 integers (0-9)
		myArrayInt[0] = 12;					//assign integer value
		myArrayInt[1] = 26;
		myArrayInt[2] = myArrayInt[0] + 8;
		myArrayInt[3] = myArrayInt[1] + myArrayInt[2];
		
		//display array values
		System.out.println("for syntax");
		for (int i = 0; i < 4; i++){		//Loop default syntax
			System.out.println(myArrayInt[i]);
			}
		System.out.println("myArrayInt.length");
		
		//display array length via method
		System.out.println(myArrayInt.length);
		System.out.println("while syntax reverse printing");
		
		//display array in reverse mode
		while (j >= 0) {
			System.out.println(myArrayInt[j]);
			j--;
		}
		
		//small array test in foreach
		String myArrayLength = "";
		int[] myArraySmall = {12, 30, 8, 62, 26};
		myArrayLength = "Length small array = " + myArraySmall.length;
		System.out.println("for each small test");
		for (int out1 : myArraySmall ){
			System.out.println(out1);
		}
		System.out.println(myArrayLength);
	}
}
