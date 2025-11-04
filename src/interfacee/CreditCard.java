package interfacee;

// Class CreditCard buat proses pembayaran lewat kartu kredit
public class CreditCard implements Payment {

    // Method pay() khusus kartu kredit, ada biaya admin yang ditambahin
    @Override
    public double pay(double amount) {
        double fee = amount * 0.02; // kena charge 2% dari total belanja
        double total = amount + fee;
        System.out.println("Pembayaran kartu kredit sebesar: " + total);
        return total;
    }
}
