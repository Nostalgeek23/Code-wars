//Character recognition software is widely used to digitise printed texts. Thus the texts can be edited,
//searched and stored on a computer.
//
//        When documents (especially pretty old ones written with a typewriter),
//        are digitised character recognition softwares often make mistakes.
//
//Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
//
//S is misinterpreted as 5
//O is misinterpreted as 0
//I is misinterpreted as 1
//The test cases contain numbers only by mistake.

public class Correct {
  public static String correct(String string) {
    StringBuilder sb = new StringBuilder(string);
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '5') {
        sb.setCharAt(i, 'S') ;
      } else if (sb.charAt(i) == '0') {
        sb.setCharAt(i, 'O');
      } else if (sb.charAt(i) == '1') {
        sb.setCharAt(i, 'I');
      }
    }
    return sb.toString();
  }

//  shorter
  public static String correct2(String string) {
    return string.replace("5","S").replace("0", "O").replace("1","I");
  }
}