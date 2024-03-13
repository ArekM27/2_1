  import java.util.Random;
  public class Main {
      public static void main(String[] args) {
          int tempC = 0;
          int tempF = 0;
        
          for(int i = 0; i < 301; i+=20) {
              tempC = i;
              tempF = (tempC * 9/5) + 32;
            System.out.println(tempC + " -> "+ tempF);
          }
      }
  }