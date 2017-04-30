package newToLeetcode;
//335. Self Crossing
public class test335 {
	int[][] visited = new int[100][100];
	public boolean isSelfCrossing(int[] x) {
		int X = 50;
		int Y = 50;
		visited[X][Y] = 1;
        for (int i = 0; i < x.length; i++){
        	switch (i % 4){
        		case 0: {
        			for (int k = 1; k <=x[i]; k++){
        				Y ++;
        				if (isVisited(X, Y)) return true;
        			}
        			break;
        		}
        		case 1:{
        			for (int k = 1; k <=x[i]; k++){
        				X --;
        				if (isVisited(X, Y)) return true;
        			}
        			break;
        		}
        		case 2:{
        			for (int k = 1; k <=x[i]; k++){
        				Y --;
        				if (isVisited(X, Y)) return true;
        			}
        			break;
        		}
        		case 3:{
        			for (int k = 1; k <=x[i]; k++){
        				X ++;
        				if (isVisited(X, Y)) return true;
        			}
        			break;
        		}
        		default:
        	}
        	
        }
        return false;
    }
	
	private boolean isVisited(int x, int y){
		if (visited[x][y] == 1) return true;
    	else{
    		visited[x][y] = 1;
    		return false;
    	}
	}
}
