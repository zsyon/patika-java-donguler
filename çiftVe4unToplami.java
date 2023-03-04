import java.util.Scanner;

public class çiftVe4unToplami {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen bir sayı giriniz : ");
      int sayi = input.nextInt();

      while(sayi<0){
        if(sayi%2 == 1){
          System.out.println("devam");
        }
      }


    
  }
  
}
