import java.util.ArrayList;

class arrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahim");
        names.add("Karim");
        names.add("Hasan");

        System.out.println(names);
 // Access by index
        System.out.println(names.get(2));
// remove
        names.remove("Karim");
        System.out.println(names);

        // Add at first
        names.addFirst("Jamal");
        System.out.println(names);

        // Remove first
        names.removeFirst();
        System.out.println(names);


    }
}