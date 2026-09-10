import java.util.HashSet;
import java.util.Set;

class hashSetExample{
    public static void main(String[] args) {
        Set<String> capitals = new HashSet<>();
        capitals.add("Ankara");
     capitals.add("Doha");
        capitals.add("Ankara");

        System.out.println(capitals);



    }
}