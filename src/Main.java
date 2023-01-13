import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("aaab");
        strings.add("aaabb");
        strings.add("aaabbb");
        strings.add("aaab");
        strings.add("aaa");
        strings.add("aaa");
        strings.add("aaab");
        strings.add("aaabb");
        makeTable(strings, 3);
    }

    public static void makeTable(List<String> strings, int columnCount) {
        if (columnCount < 1 || strings.stream().mapToInt(String::length).max().isEmpty()) return;
        int maxSize = strings.stream().mapToInt(String::length).max().getAsInt() + 5;
        int counter = 0;
        for (String str : strings) {
            counter++;
            if (counter == columnCount) {
                System.out.println(String.format("%-" + maxSize + "s", str));
                counter = 0;
                continue;
            }
            System.out.print(String.format("%-" + maxSize + "s", str));
        }

    }
}