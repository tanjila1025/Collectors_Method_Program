
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class averagingDoubleExample {

 public static void main(String[] args){
   
    List <String> rs =Arrays.asList("90","34","23","45","67");
    double num= rs.stream().collect(Collectors.averagingDouble(a->Double.parseDouble(a)));
    System.err.println(num);

    }
}