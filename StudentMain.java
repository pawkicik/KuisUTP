import java.util.*;

public class StudentMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Student > db = new HashMap<>();

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];

            switch(command){
                case "CREATE":
                    String type = parts[1];
                    String name = parts[2];
                    if (db.containsKey(name)){
                        System.out.println("Akun sudah terdaftar");
                    } else {
                        Student mhs;
                        Student s = type.equals("REGULER") ? new Reguler(name, 0, "REGULER") : new Beasiswa(name, 0, "BEASISWA");
                        db.put(name, s);
                        System.out.println(type + " " + name + " berhasil dibuat");
                    }
                    break;
                
                case "SAVE":
                    name = parts[1];
                    int amount = Integer.parseInt(parts[2]);
                    if(db.containsKey(name)){
                        System.out.println("Akun tidak ditemukan");
                    } else {
                        db.get(name).deposit(amount);
                        System.out.println("Saldo " +  name + ": " + db.get(name).getSaldo());
                    }
                    break;
                case "TAKE":
                    name = parts[1];
                    amount = Integer.parseInt(parts[2]);
                    if (!db.containsKey(name)){
                        System.out.println("Akun tidak ditemukan");
                    } else {
                        db.get(name).deposit(amount);
                        System.out.println("Saldo " + name + ": " + db.get(name).getSaldo());
                    }
                    break;
                case "CHECK":
                    name = parts[1];
                    if(db.containsKey(name)){
                        System.out.println(db.get(name).getStatus());
                    }
                    break;
            }
        }
        sc.close();
    }
}
