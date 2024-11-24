
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMapExample {
    public static void main(String[] args) {
        List <String> list =Arrays.asList("tomato","potato","botalgurd", "bettergurd");
        Map <String ,Integer> uniquList= list.stream().collect(Collectors.toMap(lt->lt, lt->lt.length()));//length is value ,key is its name
        System.out.println(uniquList);
    }
    
}
