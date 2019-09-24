public class LabelExample {

    boolean isSafe(String name){
        validation:
        {
            System.out.println(name);
            if(name.equals("a"))break validation;
            else if(name.equals("b2"))break validation;
            else if(name.equals("c3"))break validation;
            return true;
        }
        return false;
    }

public static void main(String args[]){
    LabelExample ob=new LabelExample();
    System.out.println("labels");
    System.out.println(ob.isSafe("a"));
    System.out.println(ob.isSafe("b"));
    System.out.println(ob.isSafe("c"));

    System.out.println(10%2==0?"even":"odd");  // conditional operator
    System.out.println(11%2==0?"even":"odd");

}
}
