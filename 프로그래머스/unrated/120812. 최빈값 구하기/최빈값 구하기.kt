class Solution {
    fun solution(array: IntArray): Int = array
            .groupBy{it}
            .map{it.value.size to it.key}
            .sortedByDescending { it.first }
            .let {
                if(it.size > 1 && it[0].first == it[1].first) -1 else it.first().second
            }
}