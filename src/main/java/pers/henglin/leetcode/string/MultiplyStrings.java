package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class MultiplyStrings implements Verification<String, String> {
    public String multiplyStrings(String num1, String num2){
        int[] position = new int[num1.length() + num2.length()];
        for(int num1Index=num1.length()-1; num1Index>=0; num1Index--) {
            for(int num2Index=num2.length()-1; num2Index>=0; num2Index--) {
                int multiply = (num1.charAt(num1Index) - '0') * (num2.charAt(num2Index) - '0');
                int carryIndex = num1Index + num2Index;
                int currentIndex = carryIndex + 1;
                int sum = multiply + position[currentIndex];

                position[carryIndex] += sum / 10;
                position[currentIndex] = sum % 10;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int pos:position){
            if(!(0 == result.length() && 0 == pos)){
                result.append(pos);
            }
        }
        return 0 == result.length() ? "0" : result.toString();
    }

    @Override
    public String verify(String... input) {
        return multiplyStrings(input[0], input[1]);
    }
}
