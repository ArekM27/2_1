  import java.util.Random;
  public class Main {
      public static void main(String[] args) {
          int suma = 0;

          for(int i = 1; i <= 100; i += 2) {
              System.out.println(i);
              suma += i;
          }

          System.out.println(suma);
      }
  }