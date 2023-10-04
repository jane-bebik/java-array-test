import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    Scanner chaat = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    System.out.println("---type names below and quit to exit---");
    while (true) {
      String input = chaat.nextLine();
      System.out.println("---type names below and quit to exit---");

      if ("quit".equals(input)) {
        System.out.println("---u typed quit---");
        break;

      }
      names.add(input);
    }
    System.out.println("=======Names u inputed=======");
    for (String name : names) {
      System.out.println(name);

    }

    System.out.println("=============================");
    chaat.close();

    int numberOfElements = names.size();
    int Min = 0;
    int Max = numberOfElements;
    int randomNumber = Min + (int) (Math.random() * ((Max - Min) + 1));

    System.out.println("Generated random number is : " + randomNumber);
    names.remove(randomNumber);
    Max--;

    int randomNumber2;
    do {
      randomNumber2 = Min + (int) (Math.random() * ((Max - Min) + 1));
    } while (randomNumber2 == randomNumber && names.size() > 1);

    System.out.println("Generated random number is : " + randomNumber2);
    // the code breaks if u do more then 9 names lol
  }
}
