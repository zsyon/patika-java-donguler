import java.util.Scanner;

public class çiftVe4unToplami {
    public static void main(String[] args) {

      int sayi;

      while(sayi<0){

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();

        if(sayi%2 == 1){
          System.out.println("devam");
        }
      }


    
  }
  
}
