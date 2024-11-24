
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PartitioningExample {
    public static void main(String[] args, List<Integer> partitioned) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partition the numbers and count the elements in each group
        Map<Boolean, Long> partitionedCounts = numbers.stream()
            .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));  // Counting in each group

        // Print the result
        System.out.println("Count of Even Numbers: " + partitionedCounts.get(true));
        System.out.println("Count of Odd Numbers: " + partitionedCounts.get(false));
        
    }
}
