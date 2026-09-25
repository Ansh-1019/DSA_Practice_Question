class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int answer = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                // mid is a valid square root candidate
                answer = mid;
                left = mid + 1;
            } else {
                // mid is too large
                right = mid - 1;
            }
        }

        return answer;
    }
}