
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class toListExample {
    public static void main(String[] args) {
        List <String> list=Arrays.asList("sita","rani","riya","rani","swati","retu");
        List <String> result=list.stream().filter(lt->lt.startsWith("r")).collect(Collectors.toList());
        System.err.println(result);
    }
}
