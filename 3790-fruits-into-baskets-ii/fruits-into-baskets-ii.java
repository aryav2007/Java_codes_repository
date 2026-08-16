class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for (int fruit : fruits) {
            int i = 0;
            while (i < baskets.length && baskets[i] < fruit) {
                i++;
            }
            if (i == baskets.length) {
                count++;
            } else {
                baskets[i] = 0; // basket used
            }
        }
        return count;
    }
}