import java.util.*;
class modificationarraylist{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        //adding at particular index
        a.add(1,786);
        //modifyiing
        a.set(2,7398);
        System.out.println(a);
    }
}