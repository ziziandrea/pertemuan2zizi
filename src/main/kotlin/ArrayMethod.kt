fun main(args: Array<String>) {
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    for (simpsons in simpsonsA) {
        print(simpsons + ' ')
    }
    print('\n')

    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpsons in simpsons_sorted) {
        print(simpsons + ' ')
    }
    print('\n')

    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah. that my number ${position + 1} simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("Simpsons size:" + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("min = "+ simpsonsE.minOrNull())
    println("max = "+ simpsonsE.maxOrNull())
    println("First = "+ simpsonsE.first())
    println("Last = "+ simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}