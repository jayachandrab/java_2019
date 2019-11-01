package files;
import java.io.*;
public class NonPrime {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        try{
            FileOutputStream fout =new FileOutputStream("nonpn.txt");//fileoutput object
            DataOutputStream d=new DataOutputStream(fout);    	int i,c,j;
            for( i=1;i<=500;i++)
            {
                c=0;
                for(j=1;j<i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c!=1)
                {
                    d.write(i);

                    System.out.println(i);
                }

            }
            d.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
