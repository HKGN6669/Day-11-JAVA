import java.util.*;
public class removeandclearAL{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(8);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}