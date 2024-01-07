public class EvenOrOdd {
    public static void evdd(int n){
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println("Entered Number is Even");
        }
        else{
            System.out.println("Entered number is Odd");
        }
    }

    public static void main(String[] args) {

        evdd(8);
        System.out.println();
        evdd(9);
    }
}
