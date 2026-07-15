package SoftwareDesignPrinciples.DRY_02;

public class GoodCode {
    class TaxCalculator {

    public double calculateTax(double price) {
        return price + (price * 0.18);
    }
}

class OrderService {

    private TaxCalculator taxCalculator = new TaxCalculator();

    public double calculateOrderPrice(double price) {
        return taxCalculator.calculateTax(price);
    }
}

class InvoiceService {

    private TaxCalculator taxCalculator = new TaxCalculator();

    public double calculateInvoicePrice(double price) {
        return taxCalculator.calculateTax(price);
    }
}
}
//now calculateTax method is only in one place, so if GST changes from 18% to 20%, we only need to change it in one place.