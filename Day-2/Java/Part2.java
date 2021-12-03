import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        try {
            Submarine mariner = new Submarine(0, 0, 0, true);
            List<String> lines = Files.readAllLines(Paths.get("test.in"), StandardCharsets.UTF_8);
            lines
                .stream()
                .forEach((x) -> mariner.move(x));
            System.out.println(mariner.finalDepth());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}