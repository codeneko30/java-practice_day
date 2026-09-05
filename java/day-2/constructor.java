
// example-1    
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






