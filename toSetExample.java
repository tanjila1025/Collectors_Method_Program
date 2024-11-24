
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class toSetExample {
    public static void main(String[] args) {
        List <String> list =Arrays.asList("sita","rani","riya","rani","swati","retu");

        Set <String> uniqueList=list.stream().collect(Collectors.toSet());
        uniqueList.forEach(System.out::println);
    }
}
