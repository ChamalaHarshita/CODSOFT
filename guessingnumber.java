import java.util.Scanner;
import java.util.Random;
class Numberguess{
static int n1( ){
Random r1=new Random();
int n1=r1.nextInt(100)+1;
return n1;
    }
static int hint(int n1,int n2){
if(n1==n2){
return 1;
}
int d=((n1>n2) && (n1!=n2))?2:3;
return d;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int d=0;
System.out.println("You Have 5 Rounds");
System.out.println("Hightest Score is 15 and the least Score is 0");
for(int j=1;j<=5;j++){
    System.out.println("You have three chances in round "+j+" to guess the number");
    System.out.println("Lets Start The Game");
System.out.println("Choose a number 1 to 100");
int n1=n1();
int c=0;
for(int i=0;i<=2;i++){
    int n2=sc.nextInt();
    int a= hint(n1,n2);
    if(a==1){
        break;
    }
    else if(a==2){
        c++;
        if(i==2){
            break;
        }
        System.out.println("Choose a larger number");
    }
    else if(a==3 ){
        c++;
        if(i==2){
            break;
        }
        System.out.println("Choose a smaller number");
        
    }
    
}
if(c==3){
    System.out.println("You Loose");
    System.out.println("The Number was "+n1);
    System.out.println("Your Score is "+d+" until round "+j);
    
}else{
    System.out.println("Hurray!You Won");
        d=d+(3-c);
        System.out.println("Your Score is "+d+" until round "+j);
        
        
}
}
    }}





