

abstract class accessModifiers{
    public String Fname= "Sanket";
    public String Lname= "Godse";
    public abstract void study();
}
class Student extends accessModifiers{
    public void study(){
        System.out.println("This is the abstract method of abstarct class...");
    }
}


// Write this code in another file and execute
class Second {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.study();
    }
    
}
