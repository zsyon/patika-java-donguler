import java.util.Scanner;

/**
 * InnerbolunebilmeKurallari
 */
public class bolunebilmeKurallari {
  public static void main(String[] args) {

    System.out.println("Lütfen sayı giriniz : ");
    Scanner input = new Scanner(System.in);
    int sayi = input.nextInt();

    for(int i=0 ; i<sayi ; i++){

      if(i%2==0){
        System.out.println(i);
                
      }
    }
    
  }

  
}