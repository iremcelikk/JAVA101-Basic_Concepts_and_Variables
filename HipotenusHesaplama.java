import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int firstEdge, secondEdge;
		double hypotenuseEdge;

		System.out.println("Birinci dik kenar uzunluğunu giriniz:");
		firstEdge = inp.nextInt();

		System.out.println("İkinci dik kenar uzunluğunu giriniz:");
		secondEdge = inp.nextInt();

		hypotenuseEdge = Math.sqrt(Math.pow(firstEdge, 2) + Math.pow(secondEdge, 2));
		System.out.println("Hipotenüsün uzunluğu: " + hypotenuseEdge);

	}

}
