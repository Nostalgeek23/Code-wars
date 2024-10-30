import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//
//Write a function which takes a list of strings and returns each line prepended by the correct number.
//
//The numbering starts at 1. The format is n: string. Notice the colon and space in between.

public class LineNumbering {
  public static List<String> number(List<String> lines) {

    return IntStream.range(0, lines.size())
            .mapToObj(i -> (i + 1) + ": " + lines.get(i))
            .collect(Collectors.toList());
  }
}