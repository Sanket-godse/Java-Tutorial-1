class finalk{
    final int a=10;
     void print(){
        a=20;       //this not work because a already define final
    }


}
class thiskey{
    private int a;
    private int b;

    thiskey(int a, int b){
        // a=a;    //this type of assignment does not find the refrence to the formal parameter
        // b=b;    // so this type of assignment does not any meaning

        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
}


class construct{
    // This is default constructor
    construct(){
        System.out.println("This is constructor of class construct");
    }
    // This is parameterized constructor
    construct(String a){
        System.out.println("hello "+a);
    }
        construct(String a,String b){
        System.out.println("Constructor with two parameter (constructor overloading)");
    }
    
}

public class index {
    // This code contain the static and non static information

    // we first see the static and non static variable 
    String st1="Godse";            // This is non static variable we can not access this directly without creating object
    static String st2="Sanket";    // This is static variable we can access this directly without creating object

    // Now we see the static and non static method 
    void method1(){
        System.out.println("This is the non static method this is invoked with object");
    }
    static void method2(){
        System.out.println("This is the non static method this is invoked without object");
    }





    public static void main(String [] args){
        index obj=new index();  // This is the object cretion of index class given above

        // Now we access static and non static variable
        System.out.println(obj.st1);    // accessing non static variable with object
        // System.out.println(st1);    // This line give error because non staic variable is accessible with object only
        System.out.println(st2);        // accessing static variable without object

        // Now we access the static and non static method
        obj.method1();  //accessing non sttic method with object 
        // method1()    //This line gie error because method1 is non static method
        method2();      // accessing static method without object
        System.out.println();
//------------------------------------------------------------------------------------------------
        // class construct operationare given below
        construct obj2 = new construct("sanket");   // Constructor is called according to parameter we pass or not 
//---------------------------------------------------------------------------------------------------
        // This keyword operation
        thiskey obj3 =new thiskey(10, 20);
//-----------------------------------------------------------------------------------------------------
        

    }

    
}
