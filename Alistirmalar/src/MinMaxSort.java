
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSort {

public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[] numbers;
		int cap;
		System.out.println("Girilecek deger sayisi");
		
		cap = scn.nextInt();
		numbers = new int[cap];
		
 		for(int i = 0; i < cap ; i++)
		{
		   System.out.println((i+1)+"'inci sayiyi giriniz");
		   numbers[i] = scn.nextInt(); 
		 
		}
 		System.out.print("Sayilarin siralanmis hali : ");
 		Arrays.sort(numbers);
 		for(int i = 0; i < cap ; i++) {
 			System.out.print(numbers[i] + " - ");
 		}
 		
 		int max = getMax(numbers);
 		System.out.println("Maximum value = "  + max);
 		int min = getMin(numbers);
 		System.out.println("Minimum value = "  + min);
 		
 		scn.close();
	}

	private static int getMin(int[] numbers) {
		
		 int minValue = numbers[0]; 
		    for(int i=1;i<numbers.length;i++){ 
		      if(numbers[i] < minValue){ 
		        minValue = numbers[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
	

	private static int getMax(int[] numbers) {
		 int maxValue = numbers[0]; 
		    for(int i=1;i < numbers.length;i++){ 
		      if(numbers[i] > maxValue){ 
		         maxValue = numbers[i]; 
		      } 
		    } 
		    return maxValue; 
		
	}

}
