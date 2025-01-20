// package recursion;

// public class triangle_1 {
//     public static void main(String[] args) {
//         triangle(4,0);
//     }
//     static void triangle(int r,int c){
//         if(r==0){
//             return;
//         }
//         if(c<r){
//             System.out.print("*");
//             triangle(r,c+1);
//         }else{
//             System.out.println();
//             triangle(r-1,0);
//         }
//     }
// }




//for normal triangle
package recursion;

public class triangle_1 {
    public static void main(String[] args) {
        triangle(4,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            
            triangle(r,c+1);
            System.out.print("*");
        }else{
            
            triangle(r-1,0);
            System.out.println();
        }
    }
}