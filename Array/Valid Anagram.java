
/*
Step 1: Quick check
- Quick check length of 2 chars "s" and "t"
- if the lengths are equal then return true otherwise return false

Step 2: Count number of occurrences of "s"
- create a HashMap 
- iterate over each charatcter "s"
- if not in HashHamp -> plus 1
- if in HashMap -> still plus 1 

Step 3: Count number of occurrences of "t"
- iterate over each charater of "t"
- do the oppsite of step 2 ( insted of adding, subtract)

Step 4: 
- check the characters in hashmap if they are 0 => its anagram 
*/ 

//Use HashMap

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int count : map.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}


// Use list


