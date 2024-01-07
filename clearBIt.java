public class clearBIt {
    public static int ClearBit(int n , int i){
        int bitMask =~(1<<i);
        return n & bitMask;

        //Update
    }

                                                                 // Explanation in book
    public static void main(String[] args) {
        System.out.println(ClearBit(10,1));
    }
}
