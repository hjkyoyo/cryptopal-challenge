package set1.challenge3;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

/**
 * @author huangjikun
 * @date 2019/4/4 下午5:34
 */
public class SingleXorDecode {
    public static String decode(String cipherText, Integer key) {
        byte keyByte = key.byteValue();

        byte[] bytes = HexBin.decode(cipherText);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ keyByte);
        }

        return new String(bytes);
    }

    public static void main(String[] args) {
        String cipher = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
        for (int i = 0; i < 256; i++) {
            System.out.println(i+"      "+SingleXorDecode.decode(cipher, i));
        }
        //key=88
    }
}
