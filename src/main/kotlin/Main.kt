fun main() {


    val song = Song(
        "You and Me",
        "Lifehouse",
        2005,
        178_000_000
    )

    song.printDescription()
    println(song.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    val isPopular = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}