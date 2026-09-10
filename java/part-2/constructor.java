
// constructor  example 
class softwareEngineer{
    String name;
    int age;
    String role;
    String company;
    int salary;

    softwareEngineer(String name, int age, String role, String company, int salary){
        this.name = name;
        this.age = age;
        this.role = role;
        this.company = company;
        this.salary = salary;
    }
}

class softwareEngineer_Bio{
    public static void main(String[] args){
        softwareEngineer p1 = new softwareEngineer("John", 25, "Frontend Developer", "Google", 100000);

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Role: " + p1.role);
        System.out.println("Company: " + p1.company);
        System.out.println("Salary: " + p1.salary  + " USD");

    }
}


// default constructor example

class computer{
    String name;
    int ram;
    String processor;
    int price;

    computer(){
        name = "HP";
        ram = 8;
        processor = "Intel i5";
        price = 50000;
    }
}

class computer_info{
    public static void main(String[] args) {

        computer mycomputer = new computer();

        System.out.println( mycomputer.name);
        System.out.println( mycomputer.ram );
        System.out.println(  mycomputer.processor);
        System.out.println(  mycomputer.price );

        
    }
}


// class , object,method , constructor example

class bike{
    String name;
    int speed;

    bike(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    void race(){
        System.out.println(this.name + " is racing at a speed of " + this.  speed + " km/h.");
    }
}

class bike_info{
    public static void main(String[] args) {






       

        // Creating objects of the bike class
        bike mybike = new bike("Ducati", 200);
        bike friendbike = new bike("Yamaha", 180);
        bike fatherbike = new bike("Honda", 150);
        bike brotherbike = new bike("Suzuki", 170);


        mybike.race();
        friendbike.race();
        fatherbike.race();
        brotherbike.race();
}
}                                                                                                                                  
    










