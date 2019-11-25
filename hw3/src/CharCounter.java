import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class CharCounter {

    public static void main(String[] args) {
        String filePath = "./Hamlet.txt";
        String resultPath = "./result.txt";

        Map<Character, Integer> charCounts = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int input = -1;
            while ((input = reader.read()) != -1) {
                char symbol = (char) input;
                charCounts.put(symbol, charCounts.getOrDefault(symbol, 0) +1);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (Writer fileWriter = new FileWriter(resultPath)) {
            charCounts.forEach((key, value) -> {
                try {
                    fileWriter.write(key.toString() + ":" + value.toString()+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(3);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }
    }
}