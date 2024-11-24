
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List <String> word =Arrays.asList("java","good","language");
        String rs = word.stream().collect(Collectors.joining(" "));
        System.out.println(word);
    }
}
