fun main(args: Array<String>) {
    displayMessage("D4 Rekayasa Perangkat Lunak", 10);
}
fun displayMessage(msg: String, count: Int) {
    var counter = 1
    while(counter <= count ) {
        println("$msg $counter")
        counter++
    }
}