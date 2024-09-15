package com.example.unscramble.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

// List with all the words for the Game
val allWords: Set<String> =
    setOf(
        "Ayam",
        "Angsa",
        "Ular",
        "Anjing",
        "Bebek",
        "Babi",
        "Belalang",
        "Badak",
        "Bangau",
        "Banteng",
        "Bekicot",
        "Belut",
        "Beruang",
        "Buaya",
        "Bunglon",
        "Burung",
        "Cicak",
        "Cacing",
        "Capung",
        "Cumi-cumi",
        "Dinosaurus",
        "Domba",
        "Hamster",
        "Hiu",
        "Harimau",
        "Ikan",
        "Jerapah",
        "Katak",
        "Kelelawar",
        "Kerang",
        "Kuda",
        "Kudanil",
        "Kupu-kupu",
        "Kambing",
        "Lebah",
        "Lalat",
    )

/**
 * Maps words to their lengths. Each word in allWords has a unique length. This is required since
 * the words are randomly picked inside GameViewModel and the selection is unpredictable.
 */
private val wordLengthMap: Map<Int, String> = allWords.associateBy({ it.length }, { it })

internal fun getUnscrambledWord(scrambledWord: String) = wordLengthMap[scrambledWord.length] ?: ""
