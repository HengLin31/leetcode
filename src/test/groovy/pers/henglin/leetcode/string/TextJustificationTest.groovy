package pers.henglin.leetcode.string

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class TextJustificationTest extends Specification {
    def "test TextJustification"(){
        setup: "setup TextJustification"
        Verification verification = new TextJustification()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                                                                                                           || output
        [words: ["This", "is", "an", "example", "of", "text", "justification."],                                                                         maxWidth: 16]  || ["This    is    an", "example  of text", "justification.  "]
        [words: ["What","must","be","acknowledgment","shall","be"],                                                                                      maxWidth: 16]  || ["What   must   be", "acknowledgment  ", "shall be        "]
        [words: ["Science","is","what","we","understand","well","enough","to","explain", "to","a","computer.","Art","is","everything","else","we","do"], maxWidth: 20]  || ["Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  "]
    }
}
