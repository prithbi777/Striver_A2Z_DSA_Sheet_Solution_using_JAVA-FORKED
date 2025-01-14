//problem link: https://www.naukri.com/code360/problems/distinct-characters_2221410





import java.util.*;
public class Solution {

	public static int kDistinctChars(int k, String str) {
		int l=0;
		int r=0;
		int maxlen=0;
		Map<Character,Integer> mpp=new HashMap<>();
		while(r<str.length()){
			mpp.put(str.charAt(r), mpp.getOrDefault(str.charAt(r), 0)+1);
			if(mpp.size()<=k){
				maxlen=Math.max(maxlen, r-l+1);
			}
			else{
				mpp.put(str.charAt(l),mpp.getOrDefault(str.charAt(l), 0)-1);
                if (mpp.get(str.charAt(l))==0){
					mpp.remove(str.charAt(l));
				}
				l++;
			}
			r++;
		}
		return maxlen;
	}

}
