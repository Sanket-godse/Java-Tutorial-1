public class MethodOverloading {
    // This file contain the program for the method overloading 
    // We Overloaded the three "add" method with diffrent parameter
    // Next time if we call that method then according to data type method execute

    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static String add(String a,String b){
        return a+b;
    }
    static int recursion(int a){
        if (a>0){
            return a + recursion(a-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){

        System.out.println("Adding two Integer 10+20 :" +  add(10,20));
        System.out.println("Adding two Double 1.1+2.2 :" +  add(1.0,2.0));
        System.out.println("Adding two Strings Sanket + Godse :" +  add("sanket","godse"));
        System.out.println("This is the recursion method and result is :"+recursion(10));
    }
    
}
