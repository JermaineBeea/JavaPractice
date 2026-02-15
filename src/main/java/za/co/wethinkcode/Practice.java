package za.co.wethinkcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice{

    public static void main(String[] args) {
        Object[] intArray = {11,2,3,4,5,'s'};
       List<Object> digits = Arrays.asList(intArray);

        String result = String.format("%d%d%d-%d%d%c", digits.toArray());

        System.out.println(result);
    }
}