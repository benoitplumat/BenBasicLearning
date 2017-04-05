/**
 * 
 */
package ben.java.basic;

/**
 * @author QVP6200 - Benoit Plumat
 * Exercices d'apprentissage Java - http://www.learnjavaonline.org
 * Les primitives, string and boolean
 */
public class BenHelloJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Tests Primitives Declaration
		byte zero = 0;			// 1byte
		short a = 3;			// 2bytes
		short b = 5;			// 2bytes
		int myDay = 26;			// 4bytes
		char d = ' ';			// 2bytes
		boolean e =  true;		// 1byte
		float f = 35.452f;		// 4bytes
		
		// Variables String
		String s1 = new String("Ben");
        String s2 = "Ben";
        String s3 = s1;

        boolean b1 = s1 == s2;				// false; since s1 and s2 are not the same object (new String)
        boolean b2 = s2.equals(s2 + "!");	// false; since Ben is not equal to Ben!
        boolean b3 = s3.equals(s1);			// true; since s1 is equal to s3
        
        String myStringOut = "";
        
        //Process Primitives
		String myName = "Benoit Plumat";
		String myOutput = "Hi " + a + " mydate " + myDay + d +  "mult" + d + zero + d + e + d + f;
		e = a < b;
		if(e) {
			System.out.println(myOutput);
		}
		else {
			System.out.println(myName);	
		};
		
		//Process String - check all boolean are true
		if (!b1 && !b2 && b3){
			myStringOut = s1;
			System.out.println("Yeesss Successs!");
			System.out.println(myStringOut);
		}
			else {
				System.out.println("Nooo!");
				System.out.println(myStringOut);
			}
	}

}
