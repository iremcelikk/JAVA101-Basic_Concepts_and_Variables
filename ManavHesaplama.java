import java.util.Scanner;
public class ManavHesaplama {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		double pearPrice=2.14, applePrice=3.67, 
		tomatoPrice=1.11, bananaPrice=0.95, eggplantPrice=5.00, total;
		
		int pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
		
		System.out.println("Armut kaç kilo:");
		pearKg=inp.nextInt();
		
		System.out.println("Elma kaç kilo:");
		appleKg=inp.nextInt();
		
		System.out.println("Domates kaç kilo:");
		tomatoKg=inp.nextInt();
		
		System.out.println("Muz kaç kilo:");
		bananaKg=inp.nextInt();
		
		System.out.println("Patlıcan kaç kilo:");
		eggplantKg=inp.nextInt();
		
		total=pearPrice*pearKg+applePrice*appleKg+tomatoPrice*tomatoKg+bananaPrice*bananaKg+eggplantPrice*eggplantKg;
		System.out.println("Toplam Tutar: "+total+"TL");
		
		
	}

}
