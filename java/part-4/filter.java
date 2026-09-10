
import java.util.List;
import java.util.function.Predicate;

 class ages {

    public static void main(String[] args) {

        List<Integer> ages = List.of(12, 18, 25, 15, 30, 10);

      
        Predicate<Integer> adultCheck = new Predicate<Integer>() {

            @Override
            public boolean test(Integer age) {
                return age >= 18;
            }
        };

        List<Integer> adults = ages.stream().filter(adultCheck) .toList();
                
               

        System.out.println(adults);
    }
}