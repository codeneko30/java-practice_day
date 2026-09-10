// example [overriding]

class game{
    void play(){
        System.out.println("Playing game");
    }
}

class cricket extends game{
    void play(){
        System.out.println("Playing cricket");
    }
}

class football extends game{
    void play(){
        System.out.println("Playing football");
    }
}

class gameTest{
    public static void main(String[] args){
        game g1 = new cricket();
        game g2 = new football();

        g1.play();
        g2.play();
    }
}



// example [overloading]- compile time polymorphism its not runtime polymorphism

class paymentgateway{

    void pay(int amount){
        System.out.println("Paying amount: " + amount);
    }

    void pay(int amount, String currency){
        System.out.println("Paying amount: " + amount + " in currency: " + currency);
    }

    void pay(int amount, String currency, String method){
        System.out.println("Paying amount: " + amount + " in currency: " + currency + " using method: " + method);
    }
}


class paymentTest{
    public static void main(String[] args){
        paymentgateway pay_1 = new paymentgateway();

        paymentgateway pay_2 = new paymentgateway();

        pay_1.pay(100);
        pay_1.pay(200, "USD");
        pay_1.pay(300, "EUR", "Credit Card");

        pay_2.pay(400);
        pay_2.pay(500, "GBP");
        pay_2.pay(600, "JPY", "Debit Card");


     
    }
}