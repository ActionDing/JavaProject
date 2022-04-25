package com.ding.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
    }

    public boolean isUnique(String s) {
        long left=0;
        long right=0;
        for(char c:s.toCharArray()){
            if(c>=64){
                long bitIndex=1L <<(c-64);
                if((left & bitIndex)!=0){
                    return   false;
                }
                left |=bitIndex;
            }else{
                long bitIndex=1L <<c;
                if((right & bitIndex)!=0){
                    return false;
                }
                right |=bitIndex;
            }
        }
        return true;
    }
}
