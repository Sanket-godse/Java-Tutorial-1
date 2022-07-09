import java.util.Scanner;
public class JavaInput{
    public static void main(String [] args){
        try (Scanner obj = new Scanner(System.in)) {
            String st=obj.nextLine();
            System.out.println(st);
            System.out.println(st.getClass().getSimpleName());

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
