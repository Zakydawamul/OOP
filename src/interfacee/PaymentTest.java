package interfacee;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Kelas pengujian untuk interface Payment dan turunannya
public class PaymentTest {

    @Test
    public void testCashPayment() {
        Payment p = new Cash();
        double total = p.pay(100000);
        assertEquals(100000, total, 0.0001);
    }

    @Test
    public void testCreditCardPayment() {
        Payment p = new CreditCard();
        double total = p.pay(100000);
        assertEquals(102000, total, 0.0001);
    }

    @Test
    public void testPolymorphismInterface() {
        Payment cash = new Cash();
        Payment credit = new CreditCard();
        assertEquals(100000, cash.pay(100000), 0.0001);
        assertEquals(102000, credit.pay(100000), 0.0001);
    }
}
