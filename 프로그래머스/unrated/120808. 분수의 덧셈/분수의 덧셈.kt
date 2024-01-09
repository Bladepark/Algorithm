class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val denom3 = denom1 * denom2
        val numer3 = (numer1 * denom2) + (numer2 * denom1)
        var min = 1
        
        for(i in min..numer3) {
            if(denom3 % i == 0 && numer3 % i == 0) {
                min = i
            }
        }
        answer += numer3 / min
        answer += denom3 / min
        return answer
    }
}