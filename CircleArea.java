import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double PI = 3.14, perimeter, area, sliceArea; // sliceArea-> Area of a Sector of Circle
		int r;
		int a; // central angle of circle

		System.out.println("Dairenin yarıçarpını giriniz: ");
		r = inp.nextInt();

		System.out.println("Dairenin merkez açısını giriniz: ");
		a = inp.nextInt();

		perimeter = 2 * PI * r;
		area = PI * Math.pow(r, 2);
		sliceArea = (Math.pow(r, 2) * a * PI) / 360;

		System.out.println("Dairenin çevresi: " + perimeter);
		System.out.println("Dairenin toplam alanı: " + area);
		System.out.println("Dairenin verilen merkez açısının gösterdiği dilimin alanı: " + sliceArea);

	}

}
