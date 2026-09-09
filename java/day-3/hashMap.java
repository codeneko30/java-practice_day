import java.util.HashMap;

class studentsMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "robi");
        students.put(102, "momo");
        students.put(103, "mariam");
        students.put(104, "Rahim");
        students.put(105, "Karim");
        students.put(106, "Hasan");

        System.out.println(students);

        // get
        System.out.println(students.get(102));

        // remove
        students.remove(103);
        System.out.println(students);

        // put
        students.put(106, "abir");
        System.out.println("after update" + students);

        // containsKey()
        System.out.println(students.containsKey(105));

        // containsValue()
        System.out.println(students.containsValue("momo"));
        // size()
        System.out.println(students.size());

        //keySet()

        System.out.println(students.keySet());

        //values()
        System.out.println(students.values());

       // Key + Value: entrySet()
       System.out.println(students.entrySet());

    }
}