class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val iceAmericano = 5500
        
        answer += money / iceAmericano
        answer += money % iceAmericano
        
        return answer
    }
}