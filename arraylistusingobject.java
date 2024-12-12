import java.util.*;
public class arraylistusingobject{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(8);
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
}