import java.util.*;

public class Main{
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String st = scan.nextLine();
    String goal = scan.nextLine();
    
    String com = st+st;
    
    if(com.contains(goal)){
      System.out.print("True");
    }
    else System.out.print("false");
  }
}
