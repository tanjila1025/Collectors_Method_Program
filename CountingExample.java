
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        List <String> list=Arrays.asList("riya","sita","ramu","raja");
        long totalcount=list.stream().collect(Collectors.counting());
        System.err.println(totalcount);

        
    }
}
