import org.omg.PortableInterceptor.SUCCESSFUL;

public class Calculation {
    public static void main(String [] args){

        addition(5,5);

        subtraction(5,5);

        Calculation calculation = new Calculation ();

        calculation.multiplication(10,10);

        calculation.divison(100,10);

        }

        public static void addition (int a, int b){

            System.out.println(a+b);
        }
        public static void subtraction (int a, int b){

            System.out.println(a-b);

        }
        public void multiplication (int a, int b){

            System.out.println(a*b);

        }

        public void divison (int a ,int b){

            System.out.println(a/b);

        }




















}
