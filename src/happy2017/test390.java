package happy2017;
//390. Elimination Game 
public class test390 {
    public int lastRemaining(int n) {
        boolean left = true;
        int remaining = n;
        int head = 1;
        int step = 1;
        while(remaining > 1){
        	if(left || remaining % 2 != 0)
        		head = head + step;
        	remaining = remaining / 2;
        	step *= 2;
        	left = !left;
        }
        return head;
    }
}
