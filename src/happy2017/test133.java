package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//133. Clone Graph
public class test133 {
	//DFS
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();

	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
	
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        if(map.containsKey(node)){
			return map.get(node);
		}
		UndirectedGraphNode graphcopy = new UndirectedGraphNode(node.label);
		map.put(node,graphcopy);
		for(UndirectedGraphNode neighbour: node.neighbors){
			graphcopy.neighbors.add(cloneGraph(neighbour));
		}
		return graphcopy;
    }
    //BFS? See 50 most frequent questions
}
