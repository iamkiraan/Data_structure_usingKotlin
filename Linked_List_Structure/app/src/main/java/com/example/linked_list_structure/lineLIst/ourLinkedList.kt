package com.example.linked_list_structure.lineLIst

class ourLinkedList<T> {
    private var head : Node<T>?=null
    private var tail : Node<T>?=null
    private var size : Int = 0

    fun emptyLIst():Boolean{
        return size ==0
    }


    override fun toString(): String {
       return if(emptyLIst()){
         "our linked list is empty"
        }else{
            head.toString()
        }

    }
    fun pushElement(value : T){
        head =Node(value, nextNode = head)
        if(tail == null)
        {
            tail= head
        }
        size+=1
    }
    fun appendElement(value: T){
        head = Node(value, nextNode = head)
        if(tail == null){
            tail =head
        }
        size+=1
    }
}