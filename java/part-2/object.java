// example-1

class pen{
    String color;
}

class penInfo{
    public static void main(String args[]){
        pen myPen = new pen();
        myPen.color = "blue";
        System.out.println(myPen.color);

        
    }
}


// example-2

class student{
    String name;
    String className;
    int roll;
    String gender;
}

class studentInfo{
    public static void main(String args[]){
        student student1 = new student();
        student1.name = "amir khan";
        student1.className = "9th";
        student1.roll = 17;
        student1.gender = "Male";

        System.out.println(student1.name);  
        System.out.println(student1.className);
        System.out.println(student1.roll);
        System.out.println(student1.gender);
    
    }
}