public class CalWithLambda {

    public static void main(String [] args){
        Math m = x -> x * x;
        System.out.println(m.power(5));
    }
}
