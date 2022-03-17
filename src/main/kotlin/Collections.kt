fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s")
    println()
}

fun main(args: Array<String>) {
    val stringList =  listOf("one", "two", "one")
    printAll(stringList)

    val  stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    //sebuah koleksi terurut yang dapat menyimpan elemen yang sama lebih dari
    //satu kali. Contohnya kelompok kata dalam sebuah kalimat.
}