package happy2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//355. Design Twitter
public class test355 {
	Map<Integer, HashSet<Integer>> map;
	List<int[]> news;
	
    /** Initialize your data structure here. */
    public test355() {
        map = new HashMap<>();
        news = new ArrayList<>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
    	news.add(new int[]{userId, tweetId});
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	addTwitterUser(userId);
    	List<Integer> res = new ArrayList<>();
        for(int i = news.size() - 1; i >= 0 && res.size() < 10; i--){
        	int uId = news.get(i)[0];
        	if(uId == userId || map.get(userId).contains(new Integer(uId)))
        		res.add(news.get(i)[1]); 
        }
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	addTwitterUser(followerId);
        map.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	addTwitterUser(followerId);
        map.get(followerId).remove(followeeId);
    }
    
    private void addTwitterUser(int userId) {
		if(map.get(userId) == null)
			map.put(userId, new HashSet<>());
	}
}
