import java.util.Scanner;

public class tersUcgenYapimi {
  public static void main(String[] args) {

    System.out.print("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();
    int toplam=0;

    for(int i=0 ; sayi>0 ; i++){

      System.out.println(" ");

      for(int j=0 ; j<sayi ; j++){
        System.out.print("*");
      }
      sayi--;
    }

  }
  
}
