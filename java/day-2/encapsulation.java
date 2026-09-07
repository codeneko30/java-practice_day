class student{
    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;


    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}

class student_bio{

    public static void main(String[] args) {

        student s1 = new student();

        s1.setName("Rahim");
       s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }


}

