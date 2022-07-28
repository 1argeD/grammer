import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("서울");
        list.add("대구");
        list.add("부산");
        list.add("서울");

        System.out.println(list);

        List<String > result = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}