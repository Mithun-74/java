import java.util.*;

public class toSnakeCase {
    public static void main(String[] args) {
      StringBuilder res = new StringBuilder();
      
      Scanner scan = new Scanner(System.in);
      String word = scan.nextLine();
      
      int n = word.length();
      for(int i=0;i<n;i++){
          if(Character.isUpperCase(word.charAt(i))){
               res.append("_");
               res.append(Character.toLowerCase(word.charAt(i)));
          }
          else
          res.append(word.charAt(i));
      }
      
      System.out.print(res);
  }
}
