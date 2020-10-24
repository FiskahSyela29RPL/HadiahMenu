package hadiahmenu;

import java.util.Scanner;

/*
 @author Fiskah Syela 29 RPL
 */
public class HadiahMenu {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("|          KEDAI KELAS ONLINE          |");
        System.out.println("Menu Sayur");
        String []sayur = {"\t", "1. Bayam","2. Sop","3. Soto","4. Rawon","5. Gulai","6. Tidak Memilih"};
        String []harga = {"\t","\t4000","\t\t5000","\t\t6000","\t4000","\t10.000","\t"};
        //Menampilkan makanan dan harga
        for (int i=0;i<sayur.length;i++){
                System.out.println(sayur[i] +harga[i]);
        }
        System.out.print("Silahkan Masukkan Pilihan Menu Anda : ");
        Scanner input = new Scanner (System.in);
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println(sayur[1] +harga[1]);
                break;
            case 2:
                System.out.println(sayur[2] +harga[2]);
                break;
            case 3:
                System.out.println(sayur[3] +harga[3]);
                break;
            case 4:
                System.out.println(sayur[4] +harga[4]);
                break;
            case 5:
                System.out.println(sayur[5] +harga[5]);
                break;
            case 6:
                System.out.println("Anda Tidak Membeli Sayur");
                break; 
            default:                
                System.out.println("Tolong Masukkan Nomor dari 1 hingga 6");
                break;        
                }
        String [] lauk = {"\t", "1. Ikan","2. Ayam","3. Tahu","4. Tempe","5. Kambing","6. Tidak Memilih"};
        String [] harga2 = {"\t","\t\t18.000","\t\t20.000","\t\t5000","\t4000","\t23.000","\t"};
        for (int a=0;a<lauk.length;a++){
                System.out.println(lauk[a] +harga2[a]);
        }
        System.out.print("Silahkan Masukkan Pilihan Menu Anda : ");        
        int pilihan2 = input.nextInt();
        switch (pilihan2) {
            case 1:
                System.out.println(lauk[1] +harga2[1]);
                break;
            case 2:
                System.out.println(lauk[2] +harga2[2]);
                break;
            case 3:
                System.out.println(lauk[3] +harga2[3]);
                break;
            case 4:
                System.out.println(lauk[4] +harga2[4]);
                break;
            case 5:
                System.out.println(lauk[5] +harga2[5]);
                break;
            case 6:
                System.out.println("Anda Tidak Membeli Lauk");
                break; 
            default:                
                System.out.println("Tolong Masukkan Nomor dari 1 hingga 6");
                break;        
                }
        String [] minuman = {"\t", "1. Air Putih","2. Es Teh","3. Kopi","4. Susu","5. Es Jeruk","6. Tidak Memilih"};
        String [] harga3 = {"\t","\t3000","\t5000","\t\t10.000","\t\t20.000","\t\t5000","\t"};
        for (int b=0;b<minuman.length;b++){
                System.out.println(minuman[b] +harga3[b]);
        }
        System.out.print("Silahkan Masukkan Pilihan Menu Anda : ");        
        int pilihan3 = input.nextInt();
        switch (pilihan3) {
            case 1:
                System.out.println(minuman[1] +harga3[1]);
                break;
            case 2:
                System.out.println(minuman[2] +harga3[2]);
                break;
            case 3:
                System.out.println(minuman[3] +harga3[3]);
                break;
            case 4:
                System.out.println(minuman[4] +harga3[4]);
                break;
            case 5:
                System.out.println(minuman[5] +harga3[5]);
                break;
            case 6:
                System.out.println("Anda Tidak Membeli Minuman");
                break; 
            default:                
                System.out.println("Tolong Masukkan Nomor dari 1 hingga 6");
                break;        
                }
        int total;
        total =
        
    }   
    
}
