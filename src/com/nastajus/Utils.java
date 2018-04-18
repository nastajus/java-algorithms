package com.nastajus;

public class Utils {
    public static String PrintArray(int[] array){
        String result = "";
        //without java iterators:
        for (int item : array) {
            //memory wasting version
            result += item + " "; //As every String concatenation copies the whole String, usually it is preferable to replace it with explicit calls to StringBuilder.append() or StringBuffer.append().
        }
        return result;
    }
}
