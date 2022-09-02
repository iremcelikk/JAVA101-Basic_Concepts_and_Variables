import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int firstEdge, secondEdge, thirdEdge, perimeter;
		double area;

		System.out.println("Ucgenin ilk kenar uzunluğunu giriniz: ");
		firstEdge = inp.nextInt();

		System.out.println("Ucgenin ikinci kenar uzunluğunu giriniz: ");
		secondEdge = inp.nextInt();

		System.out.println("Ucgenin ucuncu kenar uzunluğunu giriniz: ");
		thirdEdge = inp.nextInt();

		perimeter = firstEdge + secondEdge + thirdEdge;

		area = Math.sqrt((perimeter / 2) * (perimeter / 2 - firstEdge) * (perimeter / 2 - secondEdge)
				* (perimeter / 2 - thirdEdge));
		System.out.println("Ucgenin alanı: " + area);
	}

}
