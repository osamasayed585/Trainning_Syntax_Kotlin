//  1 .. 100 = 1,, 101 = 200 = 2
fun solution(year: Int): Int {
    var ans = 0;
    if (year < 100) {
        return 1
    } else {
         // 1700    // 120
        val num = year.toString()

        for (step in 0..num.length) {
            if (num.toCharArray()[2] == '0'){
                if (num.toCharArray()[3] == '0'){
                    ans = year / 100
                    break
                }else{
                    ans = (year / 100) + 1
                    break
                }
                ans =year / 100
                break
            }else{
                ans = (year / 100) + 1
                break
            }


        }
        return ans
    }
}


fun main() {
    println(solution(1996))
}