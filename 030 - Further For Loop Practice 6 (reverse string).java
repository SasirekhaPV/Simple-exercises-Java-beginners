import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below
    int length = s.length();
    for (int i = length-1;i>=0;System.out.print(s.charAt(i)),i--);
    
  }
}
