public class Method {
    static void fMethod(){
    System.out.println("This is the first method");
    }
    static void sMethod(String a){
        System.out.println("This is the second method with parameter ");
    }
    static int tMethod(){
        int a=20000000;
        System.out.println("This is third method with return value");
        return a;
    }
    public static void main(String[] a){
        fMethod();
        sMethod("sanket");
        System.out.println("Return value is "+tMethod());

    }
    
}
