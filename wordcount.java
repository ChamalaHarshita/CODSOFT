import java.util.Scanner;
import java.util.HashMap;
class Counter{
    static String[] frequencyofnumbers(String s1){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        String s2[]=s1.split("[ ;,:.?!]");//the words are separated by space,;,:.?!// 
        int c=0;
        String h=s2[0];
        String p=s2[0];
        for(String x:s2){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
                if(hm.get(x)>hm.get(h));
                h=x;
            }
            else{
                hm.put(x,1);
                c++;
            }
        }
        int f=hm.get(h);
        String g[]= new String[3];
        g[0]=h;
        g[1]=Integer.toString(c);
        if(f!=1){
            g[2]=Integer.toString(f);
        }
        else{
            g[2]="01";
        }
        return g;
    }        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] n=frequencyofnumbers(a);
        System.out.println("The total number of words are "+n[1]);
        if(n[2]== "01"){
            System.out.println("There are no repeating Words");
        }
        else{
            System.out.println("The Most Occured word is '"+n[0]+"'.It occured "+n[2]+" times.");
        }
    }
}
