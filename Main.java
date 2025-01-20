package recursion;
public class Main{
    public static void main(String[] args) {
        //write a function that prints hello world
        message(1);

    }
    public static void message(int n){
        if(n==5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        message(n+1);
    }
}
