

fun main()
{
    
    val arr= arrayOf("Argentina","Cuba","Chile","Argentina","Argentina")
    val n= arr.size

    println(findLeast(arr,n))

}
fun findLeast(arr: Array<String>, n: Int): MutableList<String> {

    val myList: MutableList <String> = ArrayList()
    val map = HashMap<String,Int>()

    for(countries: String in arr)
    {

        if(map.containsKey(countries))
        {
            var frequency= map[countries]!!
            frequency++
            map[countries] = frequency
        }
        else
        {
            map[countries] = 1
        }

    }
    var maxValue= Int.MAX_VALUE
    for (x in map)
    {
        if(maxValue>x.value)
        {
            maxValue = x.value
        }
    }
    //just showing how to print hashmap
    for((key,frequency) in map) {
        if (maxValue == frequency)
        {
            myList.add(key)
        }

    }

    return myList
}


