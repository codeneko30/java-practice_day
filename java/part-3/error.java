// try-catch

class try_catchExample{
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println("Cannot divide by zero");
        }

          System.out.println("Program continues...");
    }
}


// throw

 class throwExample {
    public static void main(String[] args) {

        int age = 25;

        if (age < 30) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }

        System.out.println("Allowed");
    }
}


// throws

class throwsExample{
    public static void checkUserLogin(String name) throws Exception{
        throw new Exception("Username cannot be empty!"  +  name);
    }

    public static void main(String[] args) {
        
        try {
            checkUserLogin("robi");
        } 
        catch (Exception e) {
            System.out.println("Error Handled: " + e.getMessage());
        }
    }
}
