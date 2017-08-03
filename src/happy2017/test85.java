package happy2017;

import java.util.Stack;

//85. Maximal Rectangle
public class test85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        	return 0;
        int col = matrix[0].length;
        int row = matrix.length;
        int[] h = new int[col + 1];
        h[col] = 0;
        int maxArea = 0;
        for(int r = 0; r < row; r++){
        	Stack<Integer> stack = new Stack<Integer>();
        	for(int c = 0; c < col + 1; c++){
        		if(c < col)
        			if(matrix[r][c] == '1')
        				h[c] ++;
        			else
        				h[c] = 0;
        		if(stack.isEmpty() || h[stack.peek()] < h[c])
        			stack.push(c);
        		else{
        			while(!stack.isEmpty() && h[c] < h[stack.peek()]){
        				int top = stack.pop();
        				int area = h[top] * (stack.isEmpty()? c: c - stack.peek() -1);
        				maxArea = Math.max(maxArea, area);
        			}
        			stack.push(c);
        		}
        	}
        }
        return maxArea;
    }
}
