
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinByExample {
    public static void main(String[] args) {

        
     Stream <String> st=Stream.of("2","5","7","9","8");
     Optional <String> obj=st.collect(Collectors.minBy(Comparator.naturalOrder()));
     if (obj.isPresent()) { 
            System.out.println(obj.get()); 
        } 
        else { 
            System.out.println("no value"); 
        } 

    }
}
