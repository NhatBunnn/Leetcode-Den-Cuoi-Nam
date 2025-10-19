class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //quick check
        if(strs == null || strs.length == 0) return new ArrayList<>();
        if(strs.length == 1) return new ArrayList<>(List.of(List.of(strs[0])));
        
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if(!map.containsKey(key)){
                 map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}