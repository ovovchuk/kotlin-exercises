package com.training.ex3

fun task3(): Nothing = TODO(
        """
            Given a word, compute the scrabble score for that word.

            Letter Values

            Letter                                               Value
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'       1
            'D', 'G'                                               2
            'B', 'C', 'M', 'P'                                     3
            'F', 'H', 'V', 'W', 'Y'                                4
            'K'                                                    5
            'J', 'X'                                               8
            'Q', 'Z'                                               10
        """
)

object ScrabbleScore {
    fun scoreWord(word: String): Int = task3()
}