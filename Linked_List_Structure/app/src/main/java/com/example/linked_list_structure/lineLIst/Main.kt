package com.example.linked_list_structure.lineLIst

fun main(){
    val ourLinkLIst = ourLinkedList<Int>()
    for(i in 1..10){
        ourLinkLIst.pushElement(i)
    }
    println(ourLinkLIst)
//    for(i in 11..15){
//        ourLinkLIst.pushElement(i)
//    }
//    println(ourLinkLIst)

}
