package interfacee;

// Class Cash buat handle pembayaran pake uang tunai
public class Cash implements Payment {

    // Method pay() versi cash, bayar sesuai nominal tanpa potongan atau tambahan
    @Override
    public double pay(double amount) {
        System.out.println("Pembayaran tunai sebesar: " + amount);
        return amount; // langsung return nominal asli karena cash gak ada biaya admin
    }
}