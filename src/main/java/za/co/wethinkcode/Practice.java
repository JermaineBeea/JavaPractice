package za.co.wethinkcode;

import java.util.List;
import java.util.ArrayList;

public class Practice{

    private static int maxConsecutiveUnique(List<Character> listChar){
        ArrayList<Character> uniqueChars = new ArrayList<>();
        int count = 0;
        for(char k: listChar){
            if(uniqueChars.contains(k)){
                break;
            }else{
                uniqueChars.add(k);
                count++;
            }
        }

        return count;
    }

    public static int maxDistinctSubstringLengthInSessions(String sessionString) {
        int sessionSize = sessionString.length();
        ArrayList<Character> letters = new ArrayList<>();
        for(char k: sessionString.toCharArray()) letters.add(k);
        int count = maxConsecutiveUnique(letters);
        for(int n = 0; n<sessionSize - 1;n++){
            sessionSize -= 1;
            if(sessionSize < count) return count;
            
            letters.removeFirst();
            int newCount = maxConsecutiveUnique(letters);

            if(newCount > count) count = newCount;

        }
        return count;
    }

    public static void main(String[] args)throws Exception {
        String chars = "abcdfedcbaefg";
        int result = maxDistinctSubstringLengthInSessions(chars);
        System.out.println("Result: " + result);
    }
}