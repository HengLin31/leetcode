package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TextJustification implements Verification<Map, List<String>> {
    private static final String SPACE = " ";

    private List<String> textJustification(String[] words, int maxWidth){
        List<String> result = new ArrayList<>();
        if((null == words) || (0 == words.length) || (maxWidth <= 0)){
            return result;
        }
        for(int index=0; index<words.length; index++){
            int sum = words[index].length();
            int point = index + 1;
            while((point < words.length) && ((sum + words[point].length() + 1) <= maxWidth)){
                sum += words[point].length() + 1;
                point++;
            }
            int spaceCount = maxWidth - sum;
            int diff = point - index - 1;
            StringBuilder temp = new StringBuilder();
            temp.append(words[index]);
            if(index + 1 == point || point == words.length){
                while(index + 1 < point){
                    temp.append(SPACE).append(words[++index]);
                }
                for(int tail=0; tail<spaceCount; tail++){
                    temp.append(SPACE);
                }
            }else{
                int average = spaceCount / diff;
                int extra = spaceCount % diff;
                while(index + 1 < point){
                    for(int head=0; head<average; head++){
                        temp.append(SPACE);
                    }
                    if(extra-- > 0){
                        temp.append(SPACE);
                    }
                    temp.append(SPACE).append(words[++index]);
                }
            }
            result.add(temp.toString());
        }
        return result;
    }

    @Override
    public List<String> verify(Map... input) {
        List<String> list = (List<String>) input[0].get("words");
        String[] words = list.toArray(new String[list.size()]);
        int maxWidth = (int) input[0].get("maxWidth");
        return textJustification(words, maxWidth);
    }
}
