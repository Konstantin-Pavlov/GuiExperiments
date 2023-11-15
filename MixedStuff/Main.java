package MixedStuff;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    }
    
    public String setString(String [] a){
        TreeSet<String> set = new TreeSet<>(Arrays.asList(a));
        StringBuilder res = new StringBuilder();
        for (String i: set) {
            res.append(i).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }

    public String setInt(int [] a){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : a){
            set.add(i);
        }
        StringBuilder res = new StringBuilder();
        for (int i: set) {
            res.append(i).append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}