class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var hashIndex = ArrayList<IntArray>()
        
        wallpaper.forEachIndexed { index, i ->
            i.forEachIndexed { index2, j ->
                if ( j == '#') {
                    hashIndex.add(intArrayOf(index, index2))
                }
            }
        }
        var minX = hashIndex.minOf{it[0]}
        var minY = hashIndex.minOf{it[1]}
        var maxX = hashIndex.maxOf{it[0]} + 1
        var maxY = hashIndex.maxOf{it[1]} + 1
        
        return intArrayOf(minX, minY, maxX, maxY)
    }
}