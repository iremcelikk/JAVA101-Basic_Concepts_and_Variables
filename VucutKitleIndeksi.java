import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		double height, result;
		int weight;

		System.out.println("Boyunuzu giriniz:");
		height = inp.nextDouble();

		System.out.println("Kilonuzu giriniz:");
		weight = inp.nextInt();

		result = weight / (Math.pow(height, 2));
		System.out.println("Vücut Kitle İndeksiniz: " + result);
	}

}
