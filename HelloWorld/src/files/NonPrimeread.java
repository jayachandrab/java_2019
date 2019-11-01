package files;

import java.io.*;
public class NonPrimeread {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        try{
            FileInputStream fin =new FileInputStream("nonpn.txt");//fileinput object
            DataInputStream d=new DataInputStream(fin);    	int i;
            while((i=d.read())!=-1)
            {
                System.out.println(i);


            } d.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
