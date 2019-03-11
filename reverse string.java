import java.util.*;
public class student{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String s1="";
        for(int i=n-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        String s2=s1.replaceAll("([aAeEiIoOuU])","");
        System.out.println(s2);
    }
}
