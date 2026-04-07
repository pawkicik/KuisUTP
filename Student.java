public class Student {

    private String nama;
    private double saldo;
    private String tipe;

    // const.
    public Student (String nama, double saldo, String tipe){
        this.nama = nama;
        this.saldo = 0;
        this.tipe = tipe;
    }

    public Student (String nama){
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public String getTipe(){
        return tipe;
    }

    public void deposit (int jumlah){
        this.saldo += jumlah;
    }

    public String getStatus(){
        return nama + " | " + tipe + " | saldo: " + saldo; 
    }
}

