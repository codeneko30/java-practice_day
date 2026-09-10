
// example-1

class calculator{

    int add(int a, int b){
        return a + b;
    }

    int divide(int a, int b){
        return a / b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }



}


class calculator_work {
    public static void main(String[] args){

        calculator calc = new calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.divide(10, 2));
        System.out.println(calc.multiply(10, 2, 3));
    }


}



// example-2

class aeroplane {

    void fly(String destination) {
        System.out.println( destination);
    }

    void fly(int speed) {
        System.out.println( speed);
    }

    void flighht_number(int flight_number) {
        System.out.println( flight_number);
    }
}



class aeroplane_info{
    public static void main(String[] args){
        aeroplane plane = new aeroplane();

         aeroplane friend_plane = new aeroplane();


// plane
        plane.fly("New York");
        plane.fly(500);
        plane.flighht_number(123);


        // friend plane
        friend_plane.fly("Los Angeles");
        friend_plane.fly(600);
        friend_plane.flighht_number(456);





        
    }
}






// examople of method overloading , intance variables and methods
class software_engineer {

    // Instance variables
    String name;
    int age;
    String role;
    String company;

    // Method overloading - 1
    void work() {
        System.out.println(name + " is working.");
    }

    // Method overloading - 2
    void work(String project) {
        System.out.println(name + " is working on " + project);
    }

    // Method overloading - 3
    void work(String project, int hours) {
        System.out.println(name + " is working on " + project
                + " for " + hours + " hours.");
    }
}

class software_engineer_info {

    public static void main(String args[]) {

        software_engineer e1 = new software_engineer();

        // Instance variable values
        e1.name = "John";
        e1.age = 25;
        e1.role = "Backend Developer";
        e1.company = "Google";

        // Method overloading
        e1.work();
        e1.work("Payment System");
        e1.work("Payment System", 8);
    }
}


  
