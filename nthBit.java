public class nthBit {
    public static int nth(int n,int i){
        int bitmask =1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int nthterm = nth(10,2);                                         //  1010
        System.out.println(nthterm);                                         //  & 0100
        System.out.println(nth(10,3));                                // ans: 000        for i =2
    }
}
