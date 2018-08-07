package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class CountAndSay implements Verification<Integer, String> {
    private String countAndSay(int n){
        String result = "1";
        if(n <= 0){
            return result;
        }
        int index = 1;
        while(index < n){
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for(int subIndex=1; subIndex<result.length(); subIndex++){
                if(result.charAt(subIndex) == result.charAt(subIndex - 1)){
                    count++;
                }else{
                    sb.append(count).append(result.charAt(subIndex - 1));
                    count = 1;
                }
            }
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
            index++;
        }
        return result;
    }

    @Override
    public String verify(Integer... input) {
        return countAndSay(input[0]);
    }
}
