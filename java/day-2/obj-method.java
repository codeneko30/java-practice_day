// example-1


class cat {
    String name;
    void call() {
        System.out.println("Meow Meow");
    }
}

class catInfo{
   public static void main(String[] args){

        cat myCat = new cat();

        myCat.name = "Tom";
        // Calling the method
        myCat.call();

        // Displaying the name of the cat
        System.out.println(myCat.name);
        
        
    }
}


// example-2

class mobile {
    String brand;
    String model;
    int price;

    void makeCall() {
        System.out.println("calling from " + brand + " " + brand);

        
    }

    void playMusic() {
        System.out.println("playing music from " + brand + " " + model);
    }

    


}


class mobileInfo {
    public static void main(String[] args) {
        mobile myMobile = new mobile();
        myMobile.brand = "Samsung";
        myMobile.model = "Galaxy S21";
        myMobile.price = 799;

        // Calling methods
        myMobile.makeCall();
        myMobile.playMusic();

        // Displaying the details of the mobile
        System.out.println(myMobile.brand);
        System.out.println(myMobile.model);
        System.out.println(myMobile.price);
    }
}



