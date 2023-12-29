class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        var command = HashMap<String, IntArray>()
        
        command.put("E", intArrayOf(0,1))
        command.put("W", intArrayOf(0,-1))
        command.put("S", intArrayOf(1,0))
        command.put("N", intArrayOf(-1,0))
        
        for (i in 0 .. park.size-1) {
            for (j in 0 .. park[i].length-1) {
                if (park[i][j] == 'S') {
                    answer = intArrayOf(i,j)
                }
            }
        }
        
        routes.forEach {
            var direction = command[it.split(" ")[0]]
            var count = it.split(" ")[1].toInt()
            var row = answer[0]
            var column = answer[1]
            
            for (i in 1..count) {
                row += direction!![0]
                column += direction!![1]
                if(row < 0 || column < 0 || row >= park.size || column >= park[0].length || park[row][column] == 'X') {
                    row = answer[0]
                    column = answer[1]
                    break
                }
            }
            answer[0] = row
            answer[1] = column
        }
        return answer
    }
}