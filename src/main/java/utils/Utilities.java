package utils;

import java.util.HashMap;
import java.util.Map;

public class Utilities {
    public static final Map<Integer, Integer> ASCII = new HashMap<>();

    static {

        int num0 = 48;
        int num1 = 49;
        int num2 = 50;
        int num3 = 51;
        int num4 = 52;
        int num5 = 53;

        ASCII.put(0, num0);
        ASCII.put(1, num1);
        ASCII.put(2, num2);
        ASCII.put(3, num3);
        ASCII.put(4, num4);
        ASCII.put(5, num5);

    }

    public int getASCIICode(int num){
        return ASCII.get(num);
    }

}
