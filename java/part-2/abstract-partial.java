
// example-1   using void metod
abstract class animal{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    abstract void sound();
}

class penguin extends animal{
    void sound(){
        System.out.println("Penguin says Honk");
    }
}

class llama extends animal{
    void sound(){
        System.out.println("Llama says Hum");
    }
}


class animal_habitat{
    public static void main(String args[]){

        llama l_1 = new llama();
        l_1.sleep();
        l_1.sound();

        penguin p_1 = new penguin();
        p_1.sleep();
        p_1.sound();

        penguin p_2 = new penguin();
        p_2.sleep();
        p_2.sound();


    }
}



// example-2

abstract class payment{
    abstract void processPayment(double amount);

    void printReceipt(String receiptNumber){
        System.out.println("Receipt Number: " + receiptNumber);
    }
}

class creditCardPayment extends payment{

    void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class paypalPayment extends payment{

    void processPayment(double amount){
        System.out.println("Processing PayPal payment of $" + amount);
    }
}


class  payment_system{
    public static void main(String args[]){

        creditCardPayment ccp = new creditCardPayment();

        ccp.processPayment(100.0);
        ccp.printReceipt("CC12345");

        paypalPayment ppp = new paypalPayment();
        ppp.processPayment(50.0);
        ppp.printReceipt("PP67890");
}
}



