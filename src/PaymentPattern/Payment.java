package PaymentPattern;

interface Payment {
    void pay();
}

class CreditCard implements PaymentPattern.Payment {
    public void pay() {
        System.out.println("Add your Credit Card Details");
    }
}
class PayPal implements PaymentPattern.Payment {
    public void pay() {
        System.out.println("Add your Paypal Information");
    }
}
class ApplePay implements PaymentPattern.Payment {
    public void pay() {
        System.out.println("Add your Apple Pay Information");
    }
}
class GooglePay implements PaymentPattern.Payment {
    public void pay() {
        System.out.println("Add your Google Pay Information");
    }
}
