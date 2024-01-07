public class Que_2 {
    static boolean Check(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(Check(10));          //Logic in Book
        System.out.println(Check(8));
    }
}
