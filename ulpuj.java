class ulpuj
{
    public static void main (String args[])
    {
        int sp=7;
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            for(int s=1;s<=sp;s++)
            {
                System.out.print(" ");
            }
            for(int z= x ;z>=1;z--)
            {
                if(z==5)
                {
                    continue;
                }
                System.out.print(z);
            }
            System.out.println();
            sp-=2;
        }
    }
}

            
