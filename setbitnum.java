public class setbitnum {
    public static int setbit(int n , int i){
        int bitMask =1<<i;
        return n|bitMask;
    }                                                           // Explanation is in Book


    public static void main(String[] args) {
        System.out.println(setbit(10,2));
    }
}
