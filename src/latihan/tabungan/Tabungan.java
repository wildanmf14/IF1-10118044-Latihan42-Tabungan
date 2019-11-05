package latihan.tabungan;

public class Tabungan {
	private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        int total = saldo - jumlah;
        return total;
    }
}
