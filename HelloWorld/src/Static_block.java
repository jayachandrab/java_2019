public class Static_block
{
    int a;
    static int x;

    {
        System.out.println("non static");
        a=20;
        x=40;

    }



  static {
        System.out.println("static");

        x=40;

    }
    Static_block()
    {
        System.out.println(a);
        System.out.println(x);
    }
    public static void main(String args[])
    {
       // Static_block ob=new Static_block();
        System.out.println("hi");
        Static_block ob=new Static_block();
    }
}