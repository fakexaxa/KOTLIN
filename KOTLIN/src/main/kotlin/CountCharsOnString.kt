
    fun main()
    {
        val word = "aabbccddd"

        printDetails(word)
    }
    private fun printDetails(word : String)
    {
        val map = HashMap<Char, Int>()

        for(i in word.indices )
        {
            if(map.containsKey(word[i]))
            {
                var frequency = map[word[i]]!!
                frequency++

                map[word[i]]=frequency
            }
            else
            {
                map[word[i]]=1
            }
        }
        for((key,frequency) in map)
        {
            if(frequency%2!=0)
            {
                println("$key = $frequency")
            }
        }
    }
