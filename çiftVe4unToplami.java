import java.util.Scanner;

public class çiftVe4unToplami {
    public static void main(String[] args) {

      int sayi;
      int cift=0;
      Scanner input = new Scanner(System.in);

      do {
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();

        if(sayi%4 == 0){
          cift += sayi;
          System.out.println("Toplam "+ cift);
        }
        
      } while (sayi>0);

      



    
  }
  
}
