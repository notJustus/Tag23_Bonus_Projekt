//TODO: hier dein Code
val gemaelde = mutableListOf<String>("Van Gogh", "AAA", "BBB")
val baeutel = mutableListOf<String>()

fun stehlen(){
    baeutel.add(gemaelde[i])
    gemaelde.removeAt(i)
}

fun main() {
    var verdacht : Int
    var erfolg: Boolean = false

    do {
        stehlen()
        verdacht = (1..100).random()
        if(verdacht < 25) println("Erwischt!")
        else {
            erfolg = true
        }
    } while (erfolg)

}