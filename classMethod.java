public class classMethod {
    // Static method .....
    static void method1(){
        System.out.println("This is the static method call..");
    }

    // Non static method 
    public void method2(){
        System.out.println("This the non static method call ..");
    }

    // Java constructor - constructor are always public
    public classMethod(){
        System.out.println("This is the text from the constructor");
    }

    // Thos is the parameterized constructor
    public classMethod(int a,int b){
        System.out.println("This is the parameterized constructor : "+ a+b);
    }

    public static void main(String[] args){
        // we call staic method without creating the objet of the class
        method1();
        // it is imposiible to call non static method without object
        classMethod myobj = new classMethod(1,2);
        myobj.method2();




    }
    
}

