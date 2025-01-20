package recursion;
import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        sub("", "abc");
        System.out.println(subarr("", "abc"));
       subseqascii("","abc");
    }

    static void sub(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p + ch, up.substring(1));
        sub(p, up.substring(1));
    }

    static ArrayList<String> subarr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subarr(p + ch, up.substring(1));
        ArrayList<String> right = subarr(p, up.substring(1));
        left.addAll(right); // Combine both lists
        return left;
    }
    static void subseqascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqascii(p+ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p+(ch+0),up.substring(1));
    }
}

