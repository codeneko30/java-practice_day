// And

class andExample{
    public static void main(String[] args) {
        int age = 25;
       boolean hasLicense = true;
       if (age >= 18 && hasLicense == true) {
            System.out.println("You are eligible to drive.");
        }
         else {
            System.out.println("You are not eligible to drive.");
        }
        

    }
}


// or
class orExample{
    public static void main(String[] args ) {
        int marks = 40;
        boolean isExtraCredit = true;

        if (marks >= 50 || isExtraCredit == true) {

            
            System.out.println("You have passed the exam.");
    }

    else {
            System.out.println("You have failed the exam.");
        }

    }
    
}