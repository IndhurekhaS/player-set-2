import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,max=0;
        char c1=0;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length-1;i++)
        {
            count=0;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }
            }
            if(max<=count)
            {
                max=count;
                c1=c[i];
            }
        }
        System.out.println(c1);
    
    }
}
