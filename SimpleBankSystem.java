import java.util.*;

public class bank{
    static Scanner sc = new Scanner(System.in);
    static List<NewUser> arr = new ArrayList<>();
    static long accountNumber =  14530025;
    public static void main(String[] args){ 
       while(true){
            System.out.print("1. New user\n2. Show all users\n3. deposit\n4. withdraw\n5. Enqury balance\n6. Exit\nChoose option: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    CreateNewUser();         
                    break;
                case 2:
                    showUser(); 
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    checkbalance();
                    break;
                case 6:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        
       }
    }

       static void CreateNewUser(){
            System.out.println("Enter your user name");
            String user = sc.next();
            System.out.println("Enter your deposit amount");
            int save = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your bank name");
            String bank = sc.next();
            NewUser newUser = new NewUser(++accountNumber, user, save, bank);
            arr.add(newUser);

            System.out.println("Successfully created new User");
            System.out.println("AccountNumber:" + accountNumber + " Name:" + user + " Savings:" + save + " Bank:" + bank);
       }

       static void showUser(){
           if(arr.isEmpty()) System.out.println("No user");
           for(NewUser i:arr){
              System.out.println(i);
           }
       }

       static void deposit(){
           System.out.println("Enter your account number");
           int acc = sc.nextInt();
           System.out.println("Enter your amount to be deposited");
           int dep = sc.nextInt();
           if(dep < 0) {
               System.out.println("Invalid Input");
               return;
           }
           for(NewUser i: arr){
               if(i.AccountNumber==acc){
                   i.savings+=dep;
                   System.out.println("updated your money "+i.savings);
                   break;
               }
           }
       }

       static void withdraw(){
            System.out.println("Enter your account number");
            int acc = sc.nextInt();
            System.out.println("Enter your amount to be withdrawed");
            int with = sc.nextInt();
            if(with < 0) {
                System.out.println("Invalid Input");
                return;
            }
            for(NewUser i:arr){
                if(i.AccountNumber==acc){
                    if(i.savings>with){
                        i.savings-=with;
                        System.out.println("your balance amount "+i.savings);
                    }
                    else {System.out.println("Money Insufficient"); break;}
                }
            }

       }

       static void checkbalance(){
            System.out.println("Enter your account number");
            int acc = sc.nextInt();
            for(NewUser i: arr){
                if(i.AccountNumber==acc){
                    System.out.println("your current savings "+i.savings);
                    break;
                }
            }
       }
       

    }

class NewUser{
    long AccountNumber;
    String userName;
    int savings;
    String bankName;
    public NewUser(long x,String y,int s, String b){
        this.AccountNumber = x;
        this.userName = y;
        this.savings = s;
        this.bankName = b;
    }

    public String toString() {
        return "AccountNumber: " + AccountNumber + ", Name: " + userName + ", Savings: " + savings + ", Bank: " + bankName;
    }
}
