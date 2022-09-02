import java.util.Scanner;
public class NotOrtalamasi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		byte math,physics,chemistry,turkish,history,music;
		float average;
		
		System.out.println("Matematik notunu giriniz: ");
		math=input.nextByte();
		
		System.out.println("Fizik notunu giriniz: ");
		physics=input.nextByte();
	
		System.out.println("Kimya notunu giriniz: ");
		chemistry=input.nextByte();
		
		System.out.println("Türkçe notunu giriniz: ");
		turkish=input.nextByte();
		
		System.out.println("Tarih notunu giriniz: ");
		history=input.nextByte();
		
		System.out.println("Müzik notunu giriniz: ");
		music=input.nextByte();
		
		average=(math+physics+chemistry+turkish+history+music)/6;
		System.out.println("Ortalama notunuz: "+average+ (average>60 ? " \n Geçtiniz :)" : "\n Kaldınız :("));
	}
	

}
