package set1.challenge2;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

/**
 * @author huangjikun
 * @date 2019/4/4 下午5:01
 */
public class FixedXor {
    public static String encode(String hex1, String hex2) {
        byte[] bytes1 = HexBin.decode(hex1);
        byte[] bytes2 = HexBin.decode(hex2);
        if (bytes1.length != bytes2.length) {
            return "";
        }

        for (int i = 0; i < bytes1.length; i++) {
            bytes1[i] = (byte) (bytes1[i] ^ bytes2[i]);
        }

        return HexBin.encode(bytes1).toLowerCase();
    }
}
