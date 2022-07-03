public class Main {
    // creating the object and accessing the data of class main through the object
    // creating the object for another class and accessing the element of that class
    int a=20;
    public static void main(String[] args){
        Main obj=new Main();
        MethodOverloading obj2 = new MethodOverloading();
        System.out.println(obj.a);
        System.out.println(obj2.add(20,28));
    }
    
}
