class Solution {
    public String intToRoman(int num) {
        // Store all standard and subtractive values in descending order
        int[] values = {
            1000, 900, 500, 400, 
            100,  90,  50,  40, 
            10,   9,   5,   4, 
            1
        };
        
        String[] symbols = {
            "M",  "CM", "D",  "CD", 
            "C",  "XC", "L",  "XL", 
            "X",  "IX", "V",  "IV", 
            "I"
        };
        
        StringBuilder roman = new StringBuilder();
        
        // Greedily subtract the largest possible value at each step
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        
        return roman.toString();
    }
}
