public class TextPrinterWithoutLambda {

    Printer p = new Printer() {
        public void print() {
            System.out.println("Hi");
        }
    };
}
