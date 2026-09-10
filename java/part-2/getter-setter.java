// example -1 : single variable
class country{
    private String name;
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

class country_info{
    public static void main(String[] args) {
        country c1 = new country();

        // setter 
        c1.setName("bangladesh");
        // getter
        System.out.println(c1.getName());
    }

}


// example -2 : multiple variable

class person{
    private String name;
    private int age;
    private String pation;

    // getter methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPation(){
        return pation;
    }

    // setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPation(String pation){
        this.pation = pation;
    }
}

class person_bio{
    public static void main(String[] args) {

        person p1 = new person();

        // setter
        p1.setName("sabbir");
        p1.setAge(25);
        p1.setPation("student");

        // getter
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPation());
    }
}
