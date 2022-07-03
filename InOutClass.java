class first{        //outer class
    
    int x=10;

    class inner{    //inner class
        int y=20;

    }
    class inner2{
        int method() {
            return x;
        }
    }

    // class inner3{                    //This method give erroe beacause it accessing non static element in static method
    //     static public int method1() {
    //         return x;
    //     }
    //     }
    

}

public class InOutClass {
    public static void main(String [] args) {
        first oobj= new first();            //object of outer class
        first.inner iobj =oobj.new inner(); //object of inner class
        System.out.println(oobj.x+iobj.y);  //innner attribute + outer attribute

        first.inner2 i2obj =oobj.new inner2();  
        System.out.println(i2obj.method());



    }
}
