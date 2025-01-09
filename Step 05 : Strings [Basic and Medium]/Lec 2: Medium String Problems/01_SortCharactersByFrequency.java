// Question Link: https://leetcode.com/problems/sort-characters-by-frequency/description/


class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>();

        for (int i = 0; i <= s.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            char c = entry.getKey();

            buckets.get(freq).add(c);
        }

        StringBuilder res = new StringBuilder();

        for (int i = buckets.size() - 1; i > 0; i--) {

            for (char c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    res.append(c);
                }
            }
        }

        return res.toString();        
    }
}


















//MINE
class Solution {
    public String frequencySort(String s) {
        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Create buckets for frequencies
        List<Character>[] buckets = new List[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Populate the buckets
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        
        // Build the result string
        StringBuilder sortedString = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            for (char c : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    sortedString.append(c);
                }
            }
        }
        
        return sortedString.toString();
    }
}
