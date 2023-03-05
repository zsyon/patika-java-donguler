import java.util.Scanner;

/**
 * mukemmelSayiBulanProgram
 */
public class mukemmelSayiBulanProgram {
  public static void main(String[] args) {
    
    System.out.print("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();
    int toplam=0;

    for(int i=1 ; i<sayi ; i++){

      if(sayi%i == 0){

        toplam += i;
        
      }

    }

    System.out.println(toplam);


  }
}