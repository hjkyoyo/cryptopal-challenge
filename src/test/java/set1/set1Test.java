package set1;

import org.junit.Assert;
import org.junit.Test;
import set1.challenge1.HexToBase64;

/**
 * @author huangjikun
 * @date 2019/4/4 下午4:53
 */
public class set1Test {
    @Test
    public void encodeTest() {
        String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
        String espect = "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t";
        String actual = HexToBase64.encode(hex);
        Assert.assertEquals("Error", espect, actual);
    }
}
