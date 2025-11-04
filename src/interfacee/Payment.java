package interfacee;

// Interface Payment jadi blueprint buat semua jenis metode pembayaran
public interface Payment {

    // Semua class yang implement interface ini wajib punya method pay()
    // Tapi implementasinya bisa beda-beda tergantung jenis pembayarannya
    double pay(double amount);
}