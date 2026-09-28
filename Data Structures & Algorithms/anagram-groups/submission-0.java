class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str : strs){
            int[] arr = new int[26];
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()){
                arr[ch-'a']++;
            }
            for(int i = 0;i < 26;i++){
                sb.append(arr[i]).append("#");
            }
            String key = sb.toString();
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(str);
                map.put(key,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}