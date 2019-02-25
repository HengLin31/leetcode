package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class CompareVersionNumbers implements Verification<String, Integer> {
    private static final String SPLIT_DOT_REGEX = "\\.";

    private int compareVersionNumbers(String version1, String version2){
        String[] version1s = version1.split(SPLIT_DOT_REGEX);
        String[] version2s = version2.split(SPLIT_DOT_REGEX);
        int longerIndex = (version1s.length < version2s.length) ? version2s.length : version1s.length;
        for(int index=0; index<longerIndex; index++) {
            Integer compareVersion1 = compare(version1s, index);
            Integer compareVersion2 = compare(version2s, index);
            if(0 != compareVersion1.compareTo(compareVersion2)){
                return compareVersion1.compareTo(compareVersion2);
            }
        }
        return 0;
    }

    private int compare(String[] versions, int index){
        return (index < versions.length) ? Integer.parseInt(versions[index]) : 0;
    }

    @Override
    public Integer verify(String... input) {
        return compareVersionNumbers(input[0], input[1]);
    }
}
