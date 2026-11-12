class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();

        int n = strs.size();

        for(int i = 0; i < n; i++){
            string.append(strs.get(i));

            string.append("😊");
        }

        return string.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();

        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            StringBuilder s = new StringBuilder();

            while(i < n && str.charAt(i) != '😊'){
                s.append(str.charAt(i));
                i++;
            }
            i++;
            list.add(s.toString());
        }

        return list;
    }
}
