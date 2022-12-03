class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        //for input "tree"....mp contains...e-->2,r-->1,t-->1
      List<Character> chars = new ArrayList(mp.keySet());
        //Now the chars contain only the unique characters...now list contains...[e,r,t]
      Collections.sort(chars, (a, b) -> (mp.get(b) - mp.get(a)));
        //After sorting based on values present in map...now list becomes[t,r,e]
      String sb = new String();
	for (char c : chars) {
		for (int i = 0; i < mp.get(c); i++) {
			sb+=c;
		}
	}
	return sb;
    }
}
