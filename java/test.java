
 class Main {

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Hello");
        printData(100);
        printData(10.5);
    }
}