package files;

interface MyInterfaceA{
    void display();
    interface MyInterfaceB{
        void myMethod();
    }
}

class NestedInterfaceDemo1 implements MyInterfaceA
{
    public void display(){
        System.out.println("interface method");
    }

    public static void main(String args[]){
        MyInterfaceA obj=
                new NestedInterfaceDemo1();
        obj.display();
    }
}