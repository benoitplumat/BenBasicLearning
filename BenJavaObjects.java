package ben.java.basic;

//creation d'une class Point de coordonnées x et y
class Point {
	private float X;
	private float Y;
	public Point(float x, float y){
		this.X = x;
		this.Y = y;
	}
	public void xyprint() {
		System.out.println("(" + this.X + "," + this.Y + ")");
	}
	public void xyscale() {
		this.X = this.X/2;
		this.Y = this.Y/2;
	}
}

public class BenJavaObjects {

	public static void main(String[] args) {
		int j = 2;
		// imprime une liste de points avec coordonnées x et y
		Point point = new Point(20,20);
		System.out.println("Valeurs initiales de X et Y");
		point.xyprint();
		for (int i=0; i < 4; i++) {
		System.out.println("Valeur de X et Y mis à l'échelle 1/" + j);
		j = j*2;		
		point.xyscale();
		point.xyprint();
		}
	}

}
