import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

     public static void main(String[] args) {
          runGame();
     }

     public static int[] randomNumber(int lengthOfNumber, int[] array) {

          Random r = new Random();

          int number, randomArray[] = new int[lengthOfNumber];

          while (randomArray[0] == 0000) {

               for (int i = 0; i < randomArray.length; i++) {
                    number = r.nextInt(10);

                    for (int j = 0; j < randomArray.length; j++) {
                         if (randomArray[j] == number) {
                              number = r.nextInt(10);
                              j = 0;
                         }
                    }
                    randomArray[i] = number;
               }
          }
          return randomArray;
     }

     public static void writeArray(int[] array) {
          
          for (int i : array) {
               System.out.print(i);
          }
     }

     public static int[] decompose(int lengthOfNumber, int number, int[] array) {

          while (number > 0) {
               for (int i = 0; i < lengthOfNumber; i++) {
                    int numberForArray = 0;
                    numberForArray = number % 10;
                    array[lengthOfNumber - i - 1] = numberForArray;
                    number = number / 10;
               }
          }
          return array;
     }

     public static String runGame() {
          
          Scanner kb = new Scanner(System.in);
          System.out.print("Lütfen kaç basamak olacağını giriniz : ");
          int lengthOfNumber = kb.nextInt();

          int[] computerArray = new int[lengthOfNumber];
          int[] myArray = new int[lengthOfNumber];

          computerArray = randomNumber(lengthOfNumber, computerArray);

          System.out.print("Bilgisayarın tuttuğu sayı: ");
          writeArray(computerArray);

          String str = null;
          while (!Arrays.equals(computerArray, myArray)) {
               int countForSameOrder = 0;
               int countForDifferentOrder = 0;
               System.out.println();

               System.out.print("Lütfen " + lengthOfNumber + " basamaklı tahmininizi girin: ");
               int guess = kb.nextInt();
               int lenghtOfGuess = Integer.valueOf(guess).toString().length();

               while (lenghtOfGuess != lengthOfNumber) {
                    System.out.print(
                                "Lütfen belirlediğiniz basamak sayısında tahmininizi giriniz (" 
                                + lengthOfNumber + " basamaklı) :");

                    guess = kb.nextInt();
                    lenghtOfGuess = Integer.valueOf(guess).toString().length();

               }

               decompose(lengthOfNumber, guess, myArray);

               writeArray(myArray);

               for (int i = 0; i < lengthOfNumber; i++) {
                    for (int j = 0; j < lengthOfNumber; j++) {
                         if (computerArray[i] == myArray[j] && i == j)

                              countForSameOrder++;

                         if (computerArray[i] == myArray[j] && i != j)

                              countForDifferentOrder--;
                    }
               }

               System.out.println();
               

               if (countForSameOrder == lengthOfNumber) {
                    str = "TEBRİKLER +" + lengthOfNumber + "sayının yeri de dogru!";
                    System.out.println(str);
               } else {
                    str = (countForSameOrder + " sayinin yeri dogru " + countForDifferentOrder + " sayinin yeri yanlis");
                    System.out.println(str);
               }
          }
          kb.close();
          return str;
     }
}