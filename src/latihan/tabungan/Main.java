package latihan.tabungan;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner masuk = new Scanner(System.in);

        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan saldo awal   \t\t: ");
        Tabungan tabungan = new Tabungan(masuk.nextInt());
        System.out.print("Jumlah uang yang diambil \t: ");
        System.out.println("Saldo anda sekarang   \t\t: " + tabungan.ambilUang(masuk.nextInt()));
        
        masuk.close();
    }

}
