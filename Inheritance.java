class A{
    int a=10;
    public void m1(){
        System.out.println("This is the method from class A ");
    }
}

// We cant access below method because of final declaration
 final class B{
    public void m2(){
        System.out.println("This is method of final class..");
    }
} 
public class Inheritance extends A{
    public static void main (String[] a){
        Inheritance obj=new Inheritance();
        obj.m1();
        System.out.println(obj.a);
    }
    
}
