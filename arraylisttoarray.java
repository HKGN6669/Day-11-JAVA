import java.util.*;
public class arraylisttoarray{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(8);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.get(i);
        System.out.println(Arrays.toString(b));
    }
}