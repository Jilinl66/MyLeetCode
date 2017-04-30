package happy2017;
//526. Beautiful Arrangement
public class test526 {
	int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        backtracking(N, visited, 1);
        return count;
    }
    
    private void backtracking(int N, boolean[] visited, int index) {
    	if(index > N) count++;
		for(int i = 1; i <= N; i++){
			if(!visited[i] && (index % i == 0 || i % index == 0)){
				visited[i] = true;
				backtracking(N, visited, index + 1);
				visited[i] = false;
			}
		}
	}
}
