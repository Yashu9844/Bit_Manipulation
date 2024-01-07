public class Que_03 {
    public static int Count_set(int n){
        int count = 0;
        while ((n>0)){
            if(( (n & 1 )!= 0)){
         count++;
            }
         n=    n>>1;
        }
     return count;
    }

    public static void main(String[] args) {
        System.out.println(Count_set(10));
    }
}
