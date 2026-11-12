class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int m = t.length();

        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < m; i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            }else{
                return false;
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return false;
        }

        return true;
    }
}
