import java.util.Scanner;
class word3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int l=str.length();
        for(char x='A';x<='Z';x++)
        {
            int c=0;
            for(int y=0;y<l;y++)
            {
                char ch=str.charAt(y);
                if(x==ch)
                {
                    c++;
                }
            }
            if(c!=0)
            {
            System.out.println(x+"="+c);
        }
        }
    }
}