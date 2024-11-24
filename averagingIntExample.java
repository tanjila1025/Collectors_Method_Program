import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class averagingIntExample {
    public static void main(String[] args) {
    List <String> rs =Arrays.asList("9","3","2","5","7");
   double num = rs.stream().collect(Collectors.averagingInt(a-> Integer.parseInt(a)));
    System.err.println(num);

    }
}
