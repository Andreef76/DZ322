fun main() {
   val likes = 11121
    val resalt = if (likes % 10 == 1 && likes % 100 != 11)  "человеку" else "людям"
    println("Понравилось $likes $resalt")

}