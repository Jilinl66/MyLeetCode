package happy2017;

import java.util.LinkedList;
import java.util.Queue;

//207. Course Schedule
//Worth doing again!
public class test207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
        	int pre = prerequisites[i][1];
        	int post = prerequisites[i][0];
        	indegree[post]++;
        	matrix[pre][post] = 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
        	if(indegree[i] == 0)
        		queue.offer(i);
        }
        int count = 0;
        while(!queue.isEmpty()){
        	int course = queue.poll();
        	count ++;
        	for(int i = 0; i < numCourses; i++){
        		if(matrix[course][i] != 0)
        			if(--indegree[i] == 0)
        				queue.offer(i);
        	}
        }
        return count == numCourses;
    }
}
