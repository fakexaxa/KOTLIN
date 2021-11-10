
fun main()
{
    val a = intArrayOf(10, 5, 7, 2, 4, 1, 24)
    val b = intArrayOf(8, 23, 29, 25, 40, 0, 24)
    val n = a.size + b.size
    val arr = IntArray(n)
    var count = 0

    for (i in a.indices) {
        arr[count++] = a[i]
    }
    for (i in b.indices) {
        arr[count++] = b[i]
    }

    find2ndLargest(arr,n)
    find2ndSmallest(arr,n)
}
fun find2ndLargest(arr: IntArray, n: Int) {
    var first: Int
    var second: Int
    second = Int.MIN_VALUE
    first = second
    for (i in 0 until n) {
        if (arr[i] > first) {
            second = first
            first = arr[i]
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i]
        }
    }
    if (second == Int.MIN_VALUE) {
        println("No second")
    } else {
        println("Second largest= $second")
    }
}

fun find2ndSmallest(arr: IntArray, n: Int) {
    var first: Int
    var second: Int
    second = Int.MAX_VALUE
    first = second
    for (i in 0 until n) {
        if (arr[i] < first) {
            second = first
            first = arr[i]
        } else if (arr[i] < second && arr[i] != first) {
            second = arr[i]
        }
    }
    if (second == Int.MAX_VALUE) {
        println("No second")
    } else {
        println("Second Smallest= $second")
    }
}
