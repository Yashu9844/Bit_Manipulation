public class clear_last_ith {
    public static int clear(int n ,int i){
        int bitMask = (~0)<<i;                           //~0 = -1 which is = 111111
        return n & bitMask ;
    }

    public static void main(String[] args) {
        System.out.println(clear(15,2));
    }
}
