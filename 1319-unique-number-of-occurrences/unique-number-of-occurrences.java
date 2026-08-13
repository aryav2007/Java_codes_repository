import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Set<Integer> seenFreq = new HashSet<>();
        for (int count : freq.values()) {
            if (!seenFreq.add(count)) {
                return false;
            }
        }
        return true;
    }
}