
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByWithCounting {
    public static void main(String[] args) {
        List <String> fruits = Arrays.asList("apple","jack","orange","banana","guva","apple","banana","jack","jack");
        
      Map <String, Long> fruitCount = fruits.stream().collect(Collectors.groupingBy(fruit->fruit,Collectors.counting()));
      fruitCount.forEach((fruit, count) -> System.out.println(fruit + ": " + count));
    }
    }

