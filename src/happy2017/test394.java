package happy2017;

import java.util.Stack;

//394. Decode String
//Wonderful!
public class test394 {
    public String decodeString(String s) {
    	Stack<String> stack = new Stack<>();
        int number = 0;
        String str = "";
        String reString = "";
        for(int i = 0; i < s.length(); i++){
        	char ch = s.charAt(i);
        	if(Character.isDigit(ch)){
        		number = 10 * number + (ch - '0');
        		if(!str.isEmpty()){
        			stack.push(str);
        			str = "";
        		}
        	}
        	else if(Character.isAlphabetic(ch)){
        		if(stack.isEmpty())
        			reString += ch;
        		else
        			str = str + String.valueOf(ch);
        	}
        	else if(ch == '['){
        		stack.push(String.valueOf(number));
        		number = 0;
        		str = "";
        	}
        	else if(ch == ']'){
        		String temp = "";
        		if(!Character.isDigit(stack.peek().charAt(0)))
        			str = stack.pop() + str;
    			int repeat = Integer.valueOf(String.valueOf(stack.pop()));
    			for(int j = 0; j < repeat; j++)
    				temp += str;
    			str = temp; 
        		if(stack.isEmpty()){
        			reString += temp;
        			str = "";
        		}
        	}
        }
        return reString;
    }
}
