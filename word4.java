import java.util.Scanner;
class word4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        int l =str.length();
        String w="";
        for(int x=0;x<(l-1);x++)
        {
            if(str.charAt(x)!=str.charAt(x+1))
            {
                w=w+str.charAt(x);
            }
        }
        System.out.println(w);
    }
}