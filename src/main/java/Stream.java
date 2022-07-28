import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Korea");
        list.add("Japan");
        list.add("France");
        java.util.stream.Stream<String > stream = list.stream();
        stream.map(str ->{
                    System.out.println(str);
            return str.toUpperCase();
                }).forEach(System.out::println);


        //System.out.println(list);
        //stream.forEach(System.out::println);-----//forEach의 반환 값은 void로 더 이상 x 스트림 오류가 발생한다


        System.out.println(list);
        java.util.stream.Stream<String > stream1 = list.stream();
    }
}