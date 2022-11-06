import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int k=x+y*2;
        if(x==0&&y%2==0)
        {
            System.out.print("YES");
        }
        else if(x==0&&y%2!=0)
        {
            System.out.print("NO");
        }
        else if(k%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
        
    }
}