package set1.challenge1;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

/**
 * @author huangjikun
 * @date 2019/4/4 下午4:42
 */
public class HexToBase64 {
    public static String encode(String hex) {
        byte[] bytes = HexBin.decode(hex);
        return Base64.encode(bytes);
    }
}
