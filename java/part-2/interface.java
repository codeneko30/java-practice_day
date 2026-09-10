
// 1. Interface
interface switchable {
    void turnOn();
    void turnOff();
}

// 2. Implementation Class 1: Light
class light implements switchable {

    public void turnOn() {
        System.out.println("Light turned ON: Room gets bright");
    }

    public void turnOff() {
        System.out.println("Light turned OFF: Room goes dark");
    }
}

// 3. Implementation Class 2: Fan
class fan implements switchable {

    public void turnOn() {
        System.out.println("Fan turned ON: Air starts blowing");
    }

    public void turnOff() {
        System.out.println("Fan turned OFF: Air stops");
    }
}

// 4. Main Class
 class main_test {
    public static void main(String[] args) {

        switchable myLight = new light();
        myLight.turnOn();
        myLight.turnOff();

        switchable myFan = new fan();
        myFan.turnOn();
        myFan.turnOff();
    }
}

