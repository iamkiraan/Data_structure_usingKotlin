package com.example.linked_list_structure.lineLIst

fun main(){
    val ourLinkLIst = ourLinkedList<Int>()
    ourLinkLIst.appendElement(10)
    ourLinkLIst.pushElement(20)
    ourLinkLIst.pushElement(100)
    ourLinkLIst.pushElement(210)
    println(ourLinkLIst)
}