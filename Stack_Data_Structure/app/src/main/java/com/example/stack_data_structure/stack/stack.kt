package com.example.stack_data_structure.stack

interface stack <T : Any> {
    fun push(element : T)
    fun pop() : T?
    fun peek(): T?

}