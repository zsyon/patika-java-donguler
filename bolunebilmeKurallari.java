import java.util.Scanner;

/**
 * InnerbolunebilmeKurallari
 */
public class bolunebilmeKurallari {
  public static void main(String[] args) {

    System.out.println("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();
    int sayi3=0;
    int sayi4=0;

    for(int i=0 ; i<sayi ; i++){

      if(i%3==0){
        sayi3 += i;      
      }
      
      if(i%4==0){
        sayi4 += i;
      }


    }

    System.out.println("3'ün Katlarının toplamı : " + sayi3);
    System.out.println("4'ün Katlarının toplamı : " + sayi4);
    
  }

  
}