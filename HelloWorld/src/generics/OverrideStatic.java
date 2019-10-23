package generics;


class Class1 {
    public static int Method1(){
        System.out.println("m1 class1");
        return 0;
    }
}
class Class2 extends Class1 {
    public static int Method1(){
        System.out.println("m1 class2");
        return 1;
    }

}
public class OverrideStatic {
    public static void main(String[] args){
        //Must explicitly chose Method1 from Class1 or Class2
        Class1.Method1();
        Class2.Method1();
    }
}