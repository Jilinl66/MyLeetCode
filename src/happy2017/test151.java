package happy2017;
//151. Reverse Words in a String
public class test151 {
    public String reverseWords(String s) {
        s.trim();
        if(s.isEmpty())
    		return s.trim();
        String[] strArr = s.split(" +");
        String reString = "";
        for(int i = strArr.length - 1; i >= 0; i--)
        	reString = reString + strArr[i].trim() + " ";
        return reString.trim();
    }

//    public String reverseWords(String s) {
//        s.trim();
//        if(s.isEmpty())
//    		return s.trim();
//        String reString = "";
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()){
//        	reString = st.nextToken() + " " + reString;
//        }
//        return reString.trim();
//    }
}
