import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a[] = new int[5];
      for(int i=0;i<5;i++){
          a[i] = scan.nextInt();
      }
      int count=0;
      for(int i:a){
        int sum = 0;
        int ori = i;
         while(i!=0){
             int rem = i%10;
             sum = sum * 10 + rem;
             i/=10;
         }
         if(sum==ori) count++;
      }
      
      System.out.print(count);
  }
}
