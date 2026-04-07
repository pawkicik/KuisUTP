public class Beasiswa extends Student {
    public Beasiswa (String nama, double saldo, String tipe){
        super(nama, 0, "BEASISWA");
    }

    public boolean withdraw(int jumlah){
        int actualDeduction = jumlah - 1000;
        if (actualDeduction < 0) actualDeduction = 0;

        if(getSaldo() >= actualDeduction){
           setSaldo(getSaldo() - actualDeduction);
           return true;
        }
        return false;
    }
    
}
