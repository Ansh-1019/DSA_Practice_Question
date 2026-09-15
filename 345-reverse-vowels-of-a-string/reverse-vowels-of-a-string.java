class Solution {
    public String reverseVowels(String s) {
           char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left until we find a vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // Move right until we find a vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap the vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u';

    }}