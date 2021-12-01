import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SonarOne {
    // java -cp Java/ SonarOne < sample.in from the Day-1 directory
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = IntStream
            .range(0, 2000)
            .mapToObj((x) -> sc.nextInt())
            .collect(Collectors.toList());
        long answer = IntStream
            .range(1, input.size())
            .mapToObj((x) -> Pair.of(input.get(x), input.get(x - 1)))
            .filter((pair) -> pair.increased())
            .count();

        System.out.println(answer);

        sc.close();
    }
}