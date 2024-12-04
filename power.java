public class power {
    public static int powerofn(int x,int n){
        int result=1;
        for(int i=0;i<n;i++){
            result*=x;
        }
        return result;
    }
    public static void main(String[] args) {
        int output= powerofn(2,3);
        System.out.println(output);
    }
}
