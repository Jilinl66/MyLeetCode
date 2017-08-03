package happy2017;
//537. Complex Number Multiplication
public class test537 {
    public String complexNumberMultiply(String a, String b) {
        String[] num1 = a.split("\\+|i");
        String[] num2 = b.split("\\+|i");
        StringBuilder sBuilder = new StringBuilder();
        int r1 = Integer.parseInt(num1[0]);
        int i1 = Integer.parseInt(num1[1]);
        int r2 = Integer.parseInt(num2[0]);
        int i2 = Integer.parseInt(num2[1]);
       	sBuilder.append(String.valueOf(r1 * r2 - i1 * i2)).append("+").append(String.valueOf(r1 * i2 + r2 * i1)).append("i");
        return sBuilder.toString();
    }
}





