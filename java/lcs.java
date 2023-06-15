public class lcs {
    public static int lcs(String s, String t) {
        
        int prev[] = new int[t.length() + 1];
        int curr[] = new int[t.length() + 1];
        
        for(int i = 1;i<=s.length();i++)
        {
            for(int j = 1; j<=t.length();j++)
            {
                if(s.charAt(i - 1)==t.charAt(j - 1)) curr[j] = 1 + prev[j - 1];
        
                else curr[j] =  Math.max(prev[j], curr[j - 1]);
            }
           prev = curr.clone();
        }
        return prev[t.length()];
    }
}
