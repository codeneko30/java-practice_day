// basic example of inheritance


class animal{
    void eat(){
        System.out.println("eating...");
    }
}
// number 1 extend
class dog extends animal{
    void call(){
        System.out.println("barking...");
    }
}

// number 2 extend
class cat extends animal{
    void call(){
        System.out.println("meowing...");
    }
}

class animalTest{
    public static void main(String args[]){
        
        dog a1 = new dog();

        cat a2 = new cat();

        a1.call();
        a1.eat();

        a2.call();
        a2.eat();
    }
}




// example-2
class vehical{

    String name;
    String color;
    String brand;

    void start(){
        System.out.println("vehical is starting...");
    }

    void stop(){
        System.out.println("vehical is stopping...");
    }
}


class car extends vehical{

    

    void drive(){
        System.out.println("car is driving...");
    }
}

class sportsCar extends vehical{



    void turboBoost(){
        System.out.println("sports car is using turbo boost...");
    }
}

class vehicalTest{
    public static void main(String args[]){


       
        car c1 = new car();
        car c2 = new car();

        sportsCar s1 = new sportsCar();

        c1.name = "Toyota";
        c1.color = "Red";
        c1.brand = "Toyota";

        System.out.println("Car Name: " + c1.name);
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Brand: " + c1.brand);

        c1.start();
        c1.drive();
        c1.stop();


        // c2
        c2.name = "Honda";
        c2.color = "Blue";
        c2.brand = "Honda"; 
        System.out.println("Car Name: " + c2.name);
        System.out.println("Car Color: " + c2.color);
        System.out.println("Car Brand: " + c2.brand);

        c2.start();
        c2.drive();
        c2.stop();


        // s1
       
        s1.name = "Ferrari";
        s1.color = "Yellow";
        s1.brand = "Ferrari";

        System.out.println("Sports Car Name: " + s1.name);
        System.out.println("Sports Car Color: " + s1.color);
        System.out.println("Sports Car Brand: " + s1.brand);

        s1.start();
        s1.turboBoost();
        s1.stop();
    }
}



