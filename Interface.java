interface A{            // Interface is also abstarct method of implementation
    public void m1();   // Like abstarrct class iterface also does not have body
    public void m2();   // Implementation of interface is done in subclass

}
interface C{
    public void m3();
}
// It is mandatory to implement all method which is declared in the interface
class B implements A,C{   // We extend the interface with implements keyword
    public void m1(){   
        System.out.println("This is the m1 method of interface A");
    }
    public void m2(){
        System.out.println("This is the m2 method of interface A");
    }
    public void m3() {
        // TODO Auto-generated method stub
        System.out.println("This is the m3 method of interface C");
    }
}

public class Interface {
    public static void main(String[] args){
        B ob=new B();
        ob.m1();    // Here we called the m1 method of interface A with object of class B
        ob.m2();
        ob.m3();    // This is method of interface C
    }    
}
