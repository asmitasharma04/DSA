package recursion;
import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(find(arr,4,0));
        findallindex(arr,4,0);
        System.out.println(list);
    }
    static boolean find(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr,target,index+1);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void findallindex(int []arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr,target,index+1);
    }
}

//if to return index value then 
// static int find(int []arr,int target, int index){
//     if(index==arr.length){
//         return -1;
//     }
//     if(arr[index]==target){
//         return index;
//     }
//     else{
//         return find(arr,target,index+1);
//     }
// }




//if to search from last then 
// static int find(int []arr,int target, int index){
//     if(index== -1){
//         return -1;
//     }
//     if(arr[index]==target){
//         return index;
//     }
//     else{
//         return find(arr,target,index-1);
//     }
// }