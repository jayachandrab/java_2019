package generics;
class A<E>{
    E element;
    A(E ele){
        this.element=ele;
    }

    void display(E[] arr){
       for( int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
public class Generic
{
    public static void main(String args[]){
        A ob=new A(20);
        int arr[]={1,2,3,4,5,10,0,5};
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


     //   A ob1=new A("helloworld");
      //  ob1.display();
    }

}
