import java.util.List;

 class fast_food {

    public static void main(String[] args) {

        List<String> foods = List.of(
            "burger",
            "pizza",
            "coffee"
        );

        List<String> result = foods.stream()
                .toList();

        System.out.println(result);
    }
}