package happy2017;
//547. Friend Circles
public class test547 {
    public int findCircleNum(int[][] M) {
    	int n = M.length;
    	if(n == 0) return 0;
    	int count = 0;
    	boolean[] visited = new boolean[n];
    	for(int i = 0; i < n; i++){
    		if(!visited[i]){
    			dfs(M, visited, i);
    			count++;
    		}
    	}
    	return count;
    }
    
    private void dfs(int[][] M, boolean[] visited, int index) {
		for(int j = 0; j < M.length; j ++){
			if(M[index][j] == 1 && !visited[j]){
				visited[j] = true;
				dfs(M, visited, j);
			}
		}
	}
}