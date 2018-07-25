package com.training.ex5

import java.util.ArrayList
import java.util.HashSet

fun task5(): Nothing = TODO("""
    Add a 'partitionTo' function that splits a collection into two collections according to a predicate.
    Uncomment the commented invocations of 'partitionTo' below and make them compile.

    There is a 'partition()' function in the standard library that always returns two newly created lists.
    You should write a function that splits the collection into two collections given as arguments.
    The signature of the 'toCollection()' function from the standard library may help you.
""")

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
    task5() // delete this line
//    return partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
    task5() // delete this line
//    return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
}

