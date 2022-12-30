fun main() {
    print(solution(5, 2))
}

fun solution(candlesNumber: Int, makeNew: Int): Int {
    var leftOvers = candlesNumber
    var count = candlesNumber
    while (leftOvers >= makeNew) {
        var tempLeftOvers = leftOvers
        while (tempLeftOvers % makeNew != 0) {
            tempLeftOvers--
        }
        leftOvers -= tempLeftOvers
        count += tempLeftOvers / makeNew
        leftOvers += tempLeftOvers / makeNew
    }
    return count
}
