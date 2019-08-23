public class TextPrinterWithLambda {

    public static void main(String args[]){

        Printer p = () -> System.out.println("Hi");
        p.print();
    }

}
