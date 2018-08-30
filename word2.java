import java.util.Scanner;
class word2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        str=str.toUpperCase().trim()+" ";
        int l=str.length();
        String word="";
        int c=0;
        for(int x=0;x<l;x++)
        {
            char ch=str.charAt(x);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                int w=word.length();
                for(int y=0;y<(w-1);y++)
                {
                    if(word.charAt(y)==word.charAt(y+1))
                    {
                        c++;
                        System.out.println(word);
                        break;
                    }
                }
                word="";
            }
        }
        System.out.println("no. of double letter words are "+c);
    }
}
