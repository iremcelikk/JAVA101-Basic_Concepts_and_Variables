import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int startPrice = 10, km;
		double perKm = 2.2, total;

		System.out.println("km değerini giriniz: ");
		km = inp.nextInt();

		total = startPrice + km * perKm;

		System.out.println("Toplam Ücret: " + (total < 20 ? 20 : total));

	}

}
