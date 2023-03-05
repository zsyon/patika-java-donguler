import java.util.Scanner;

public class tersUcgenYapimi {
  public static void main(String[] args) {

    System.out.print("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();
    int toplam=0;

    for(int i=1 ; sayi>=i ; i++){

      for(int j=1 ; sayi<=j ; j--){
        System.out.println("*");
      }
    }
    
  }
  
}
