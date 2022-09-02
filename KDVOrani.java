import java.util.Scanner;

public class KDVOrani {
	
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Fiyatı Giriniz:");
		 int price=inp.nextInt();		 	 
		 double kdvRate=(price>0 && price<=1000) ? 0.18 : 0.08;
		 double kdvPrice=price*kdvRate;
		 double kdvNewPrice=price+kdvPrice;
		 
		  
		 System.out.println("KDV Öncesi Fiyat: "+price);
		 System.out.println("KDV Oranı: "+kdvRate);
		 System.out.println("KDV Tutarı: "+kdvPrice);
		 System.out.println("KDV Sonrası Fiyat: "+kdvNewPrice);
}

}
