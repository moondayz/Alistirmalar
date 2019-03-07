import java.util.Scanner;

public class SayiBasamaklari {

	public static void main(String[] args) {
		
		// Girilen sayiyi basamaklarina ayirip ayri ayri yazdir.
		
		int sayi ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz : ");
		sayi = scan.nextInt();
		
			
			int binler = sayi/1000;
			sayi= sayi - (1000*binler);
	
			int yuzler=sayi/100;      
			sayi=sayi-(100*yuzler);	
				
			int onlar=sayi/10;   
			sayi=sayi-(10*onlar); 
				
			int birler=sayi;    
			
			System.out.println("Binler basamagi : " + binler);
			System.out.println("Yuzler basamagi : " + yuzler);
			System.out.println("Onlar basamagi  : " + onlar);
			System.out.println("Birler basamagi : " + birler);
			
		
		

		scan.close();
	}

}
