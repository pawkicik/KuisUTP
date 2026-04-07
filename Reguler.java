public class Reguler extends Student {
    
    public Reguler(String nama, double saldo, String tipe){
        super(nama, '0', "REGULER");
    }

    public boolean withdraw(int jumlah){
        if (getSaldo() >= jumlah){
            setSaldo(getSaldo() - jumlah);
            return true;
        }
        return false;
    }
}
