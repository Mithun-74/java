import java.util.HashSet;

public class removeoccurance{
        public static void main(String[] args) {
            String a = "processed";
            String b = "esd";
            HashSet<Character> hs = new HashSet<>();
            StringBuilder result = new StringBuilder();
            for(char ch:b.toCharArray()){
                hs.add(ch);
            }

            for(char ch:a.toCharArray()){
                if(!hs.contains(ch))  result.append(ch);
            }

            System.out.println(result);
        }
}
