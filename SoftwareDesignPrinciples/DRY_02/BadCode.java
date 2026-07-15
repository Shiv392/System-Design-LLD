package SoftwareDesignPrinciples.DRY_02;

class OrderService {

    public double calculateOrderPrice(double price) {
        return price + (price * 0.18);
    }
}

class InvoiceService {

    public double calculateInvoicePrice(double price) {
        return price + (price * 0.18);
    }
}


// Tax calculation duplicate hai.
// Kal GST 18% se 20% hua to dono jagah change karna padega.