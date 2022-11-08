// Ters Üçgen yazdırma 
package ters_ucgen_yazdirma;
import java.util.Scanner;

public class Ters_ucgen_yazdirma {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Satır Sayısı Giriniz :");
        int satir = input.nextInt();
        
        
        for (int i = satir; i>=1;i--) {
            
            for (int j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
