package set1;

import org.junit.Assert;
import org.junit.Test;
import set1.challenge1.HexToBase64;
import set1.challenge2.FixedXor;

/**
 * @author huangjikun
 * @date 2019/4/4 下午4:53
 */
public class set1Test {
    @Test
    public void HexToBase64Test() {
        String hex = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
        String expected = "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t";
        
        String actual = HexToBase64.encode(hex);
        Assert.assertEquals("Error", expected, actual);
    }

    @Test
    public void FixedXorTest() {
        String hex1 = "1c0111001f010100061a024b53535009181c";
        String hex2 = "686974207468652062756c6c277320657965";
        String expected = "746865206b696420646f6e277420706c6179";
        
        String actual = FixedXor.encode(hex1, hex2);
        Assert.assertEquals("Error", expected, actual);
    }
}
