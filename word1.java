import java.util.Scanner;
class word1
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        double w=0;
        double c=0;
        int l=str.length();        
        for(int x=0;x<l;x++)
        {
            char ch=str.charAt(x);
            if(ch==' ')
            {
                w++;
            }
            else
            {
                c++;
            }
        }
        double a=c%w;
        a--;
        double cc=c/w;
        double avg=a/w;
        System.out.println("Average is = "+(cc+avg));
    }
}