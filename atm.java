import java.util.Scanner;
class Interface1{
    float banc=0;
    public void options(){
        System.out.println("1.Balance Enquiry");
        System.out.println("2.Withdrawal");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice");
        int n=sc.nextInt();
        if(n==1){
            bl();
        }
        else if(n==2){
            wd();
        }
        else if(n==3){
            dp();
        }
        else if(n==4){
            return;
        }
        else{
            System.out.println("Enter a valid Choice");
        }
    }
    public void op2(){
        System.out.println("Want to continue");
        System.out.println("1.YES   2.NO");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            options();
        }
        else if(a==2){
            return;
        }
        else{
            System.out.println("Enter Correct Choice");
        }
    }
    public void bl(){
        System.out.println("Available Balance :+banc");
        op2();
    }
    public void wd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be withdraw(In 100,200,500,2000):");
        float w=sc.nextFloat();
        if(w<=banc){
            banc=banc-w;
            System.out.println("Transcation completed.Available Balance "+banc);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        op2();
    }
    public void dp(){
        System.out.println("Enter amount to deposit(Only In 100,200,500,2000):");
        System.out.println("Can deposit upto rs:20000 at once");
        Scanner sc=new Scanner(System.in);
        float d=sc.nextFloat();
        if(d<=20000){
        banc=banc+d;
        System.out.println("Deposited Successfully.Available Balance "+banc);
        }
        else{
            System.out.println("Deposit proper notes/ Deposit limited Amount");
        }
        op2();
    }
}
class Interface2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Interface1 p1=new Interface1();
        int pin=1234;
        int i=0;
        while(i<3){
            System.out.println("Enter your 4 digit pin");
            int n=sc.nextInt();//incase of incorrect pin user can enter 3 times.
            if(pin!=n){
                if(i==2){
                    System.out.println("Incorrect PIN ! Try after 24 hours");
                    break;
                }
                i++;
                System.out.println("Incorrect Pin.Enter correct pin");
            }
            else{
                p1.options();
                break;
            }
        }
    }
}

