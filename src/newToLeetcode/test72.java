package newToLeetcode;
//72. Edit Distance
public class test72 {
    public int minDistance(String word1, String word2) {
       int m = word1.length();
       int n = word2.length();
       int[][] dis = new int[m+1][n+1];
       for(int i = 0; i <=m; i++)
    	   dis[i][0] = i;
       for(int j = 1; j <=n; j++)
    	   dis[0][j] = j;
       for(int i = 0; i < m; i++){
    	   for(int j = 0; j < n; j++){
    		   if(word1.charAt(i) == word2.charAt(j))
    			   dis[i + 1][j + 1] = dis[i][j];
    		   else{
    			   int repCost = dis[i][j];
    			   int delCost = dis[i + 1][j];
    			   int insCost = dis[i][j + 1];
    			   if(repCost <= delCost){
    				   if(repCost <= insCost)
    					   dis[i + 1][j + 1] = repCost + 1;
    				   else
    					   dis[i + 1][j + 1] = insCost + 1;
    			   }
    			   else{
    				   if(delCost <= insCost)
    					   dis[i + 1][j + 1] = delCost + 1;
    				   else
    					   dis[i + 1][j + 1] = insCost + 1;
    			   }
    		   }
    	   }
       }
       return dis[m][n];
    }
}
