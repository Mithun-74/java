import java.util.*;

public class Main{
  public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      String a = scan.nextLine();
      
      String[] words = a.toLowerCase().split("\\s+");
      
      HashMap<String ,Integer> hm = new HashMap<>();
      
      for(String word : words){
          hm.put(word,hm.getOrDefault(word,0)+1);
      }
      
      Map<String, Integer> sortedMap = new TreeMap<>(hm);
      for(String word: sortedMap.keySet()){
          System.out.println(word+"-"+hm.get(word));
      }
  }
}
