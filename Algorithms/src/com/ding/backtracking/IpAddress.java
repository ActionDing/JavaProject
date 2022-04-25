package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 恢复IP地址
 * 题目：输入一个只包含数字的字符串，请列出所有可能恢复出来的IP地址。
 * 例如，输入字符串"10203040"，可能恢复出3个IP地址，分别为"10.20.30.40"、"102.0.30.40"和"10.203.0.40"。
 */
public class IpAddress {
    public static void main(String[] args) {
        IpAddress ipAddress = new IpAddress();

        List<String> strings = ipAddress.restoreIpAddress("10203040");
        System.out.println(strings);
    }

    public List<String> restoreIpAddress(String s) {
        List<String> result = new LinkedList<>();

        helper(s, 0, 0, "", "", result);
        return result;
    }

    private void helper(String s, int i, int segI, String seg, String ip, List<String> result) {
        if (i == s.length() && segI == 3 && isValidSeg(seg)) {
            result.add(ip + seg);
        } else if (i < s.length() && segI <= 3) {
            char ch = s.charAt(i);
            if (isValidSeg(seg + ch)) {
                helper(s, i + 1, segI, seg + ch, ip, result);
            }
            if (seg.length() > 0 && segI < 3) {
                helper(s, i + 1, segI + 1, "" + ch, ip + seg + ".", result);
            }
        }
    }

    private boolean isValidSeg(String seg) {
        return Integer.parseInt(seg) <= 255 && (seg.equals("0") || seg.charAt(0) != '0');
    }
}
