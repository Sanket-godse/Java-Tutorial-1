// Abstract method is used to hiding the implementation deatails from the user
// It provide security to user 
// Absract method of abstract does not have body
abstract class A{
    abstract void m1();
     void m2(){
        System.out.println("This is the abstract class method");
    }
}
class B extends A{
     void m1(){
        System.out.println("This is abstract method from another class");

    }
}

public class AbstractClass {
    public static void main(String[] args){
        B obj= new B();
        obj.m1();       //Abstract method call 
        obj.m2();       //Abstract class regular method call
    }
    
}
