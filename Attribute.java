
public class Attribute {
    // Global attribute
    int x=20;
    final int y=40;     // Final is keyword that restrict the variable from the modification/changes

    String Fname= "Sanket";
    String lname="Godse";
    public static void main(String[] args ){
        Attribute obj=new Attribute();
        System.out.println(obj.x);
        // Modifying the global attribute with object
        obj.x=30;
        System.out.println("This is the value from the object obj : "+obj.x);
        // Final variable modifying
        // obj.y=100;  //this line give error

        // Now we create the two object of one class and change within one object and see what happen
        Attribute obj1= new Attribute();
        Attribute obj2= new Attribute();

        obj2.x=300000;
        System.out.println("This is the x of object obj1 : "+obj1.x);
        System.out.println("This is the x of object obj2 : "+obj.x);

        // multiple attribute checking
        Attribute myobj =new Attribute();
        System.out.println("This is the example of the multiple attribute : "+myobj.Fname +" "+myobj.lname);



    }
}
