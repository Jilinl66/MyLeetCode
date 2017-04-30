package happy2017;
//521. Longest Uncommon Subsequence I
public class test521 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
}
