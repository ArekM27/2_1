public class Main {
  public static void main(String[] args) {
    String spacja = " ";
    String myString = "Hello world!";
    for (int i = 0; i < myString.length(); i++) {
      System.out.println(spacja.repeat(i) + myString.charAt(i));
    }
  }
}