class Solution {
    public int calculateScore(int a, int b) {
         int Acount = Integer.bitCount(a);
        int Bcount = Integer.bitCount(b);

        return Acount >= Bcount ? Acount * Bcount : Bcount / Acount;
    }
}