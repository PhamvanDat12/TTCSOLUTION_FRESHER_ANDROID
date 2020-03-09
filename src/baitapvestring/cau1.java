package baitapvestring;

import java.sql.SQLOutput;
import java.util.*;

public class cau1 {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     int count = 0;
     char art = 0;
        System.out.println("mời nhập :");
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        String [] arr=s.split("");

        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }

        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){


            int value = entry.getValue();
            value ++;

                System.out.println("từ  "+entry.getKey()+" xuất hiện  "+entry.getValue() + " lần tại "+value +" vị trí thứ");



        }

    }
}
