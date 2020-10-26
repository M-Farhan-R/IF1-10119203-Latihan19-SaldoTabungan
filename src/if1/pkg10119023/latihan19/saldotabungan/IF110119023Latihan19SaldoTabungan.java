/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program menghitung saldo tabungan
 *
 */
//import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class IF110119023Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        System.out.print("Saldo alwal: Rp");
        Scanner scan1 = new Scanner(System.in);
        int saldo = scan1.nextInt();
        
        System.out.print("Bunga/Bulan(%): ");
        Scanner scan2 = new Scanner(System.in);
        int bunga = scan2.nextInt();
        
        System.out.print("Lama(Bulan): ");
        Scanner scan3 = new Scanner(System.in);        
        int bulan = scan3.nextInt();
        
        
        
        for (int i=1;i<=bulan;i++){
            int bunga2 = (saldo * bunga)/100;
            saldo = saldo + bunga2;
            System.out.printf(Locale.GERMAN,
                    "Saldo di bilan ke-"+i+" Rp.%,d%n",saldo);
        }
    }

}
