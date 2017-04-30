package happy2017;
//371. Sum of Two Integers
public class test371 {
    public int getSum(int a, int b) {
        return b == 0? a: getSum(a ^ b, a & b << 1);
    }
}
