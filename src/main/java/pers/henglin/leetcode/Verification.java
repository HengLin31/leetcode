package pers.henglin.leetcode;

/**
 * Created by linheng on 2018/5/18.
 */
public interface Verification<INPUT, OUTPUT> {
    OUTPUT verify(INPUT... input);
}
