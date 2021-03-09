package kr.co.mapo

import java.util.*;

fun main() {
    //starTree()
    lottery()
}

fun lottery() {
    val reader = Scanner(System.`in`)
    val count:Int = reader.nextInt()
    val lottoRange = 1..45

    val lottoSet = mutableSetOf<Int>()

    for(i in 0 until count-1) {
        println("${i+1} 회차 : ")
        for(j in 0..7) {
            lottoSet.add(lottoRange.random())
        }

        for(j in lottoSet) {
            print("$j ")
        }
        println()
        lottoSet.clear()
    }

}

fun starTree() {
    val start = 1
    val end = 15
    val tree = start..end

    //위에서 아래로
    for(i in tree step 2) {
        for(j in i until end step 2)
            print(" ")

        for(k in 1..i)
            print("*")
        println()
    }

    println()
    //아래에서 위로
    for(i in end downTo start step 2) {
        for(j in end downTo i+1 step 2)
            print(" ")

        for(k in i downTo 1)
            print("*")
        println()
    }

    println()

    //위아래 둘다
    for(i in tree step 2) {
        for(j in i until end step 2)
            print(" ")

        for(k in 1..i)
            print("*")
        println()
    }
    for(i in end downTo start+1 step 2) {
        for(j in end downTo i step 2)
            print(" ")

        for(k in i downTo 1+2)
            print("*")
        println()
    }
}
