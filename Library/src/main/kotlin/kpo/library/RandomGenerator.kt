package kpo.library

import java.util.Random


class RandomGenerator(
    private val random: Random = Random()
){

    fun generateInt(): Int {
        val random: Random = Random()
        return random.nextInt(1000)
    }

    fun generateString(): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..generateInt()).
                map{ allowedChars.random() }.
                joinToString("")
    }
}