package happycoding2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q133_CloneGraph {
	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
		 
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;   
        }
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        return helperClone(node, map);
    }  
    
    private UndirectedGraphNode helperClone(UndirectedGraphNode parent, Map<Integer, UndirectedGraphNode> map) {
        int key = parent.label;
        UndirectedGraphNode clone = new UndirectedGraphNode(key);
        map.put(key, clone);
        for (UndirectedGraphNode child: parent.neighbors) {
            UndirectedGraphNode childNode = map.get(child.label);
            if (childNode == null) {
                childNode = helperClone(child, map);
            }
            clone.neighbors.add(childNode);
        }
        return clone;
    } 
}
