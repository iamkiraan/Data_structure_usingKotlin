package com.example.linked_list_structure.lineLIst

fun main(){
    val node1 = Node(value = 10)
    val node2 = Node(value = 20)
    val node3 = Node(value = 30)
    val node4 = Node(value = 40)

    node1.nextNode = node2
    node2.nextNode=node3
    node3.nextNode=node4
    println(node1)

}