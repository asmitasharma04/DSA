public class distribute_chocolates {
    static boolean isDivisionPossible(int[]a,int m,int mxchocoallowed){
        int noofstudents=1;
        int choco=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mxchocoallowed)return false;
            if(choco+a[i]<=mxchocoallowed){
                choco+=a[i];
            }else{
                noofstudents++;
                choco=a[i];
            }
        }
         return noofstudents<=m;

    }
    static int chocolate(int[] a,int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int [] a={5,3,1,4,2};
    int m=3;
    System.out.println(chocolate(a,m));
}
}
