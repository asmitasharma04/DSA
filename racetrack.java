public class racetrack { 
    static boolean isPossible(int []a,int k,int dist){
        int kidsplaced=1;
        int lastkid=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastkid>=dist){
                kidsplaced++;
                lastkid=a[i];
            }
        }
        return kidsplaced>=k;

    }
    static int racetrack(int []a,int k){
        if(k>a.length)return -1;
        int s=0,end=(int)1e9;
        int ans=-1;
        while(s<=end){
            int mid=s+(end-s)/2;
            if(isPossible(a,k,mid)){
                ans=mid;
                s=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a={1,2,4,8,9};
        int k=2;
        System.out.println(racetrack(a,k));
    }
}
