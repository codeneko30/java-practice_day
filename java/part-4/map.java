
import java.util.List;
import java.util.function.Function;

 class foods {

    public static void main(String[] args) {

        List<String> products = List.of("burger", "pizza", "coffee");

        Function<String, String> upperCase = new Function<String, String>() {

            @Override
            public String apply(String product) {
                return product.toUpperCase();
            }
        };

        List<String> result = products.stream().map(upperCase).toList();

        System.out.println(result);
    }
}