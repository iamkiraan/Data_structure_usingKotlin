package com.example.stack_data_structure.stack

class Implementation<T : Any> :stack<T> {
    val storage = arrayListOf<T>()
    override fun toString() = buildString {
        appendLine("-------Top---------")
        storage.reversed().forEach{
            appendLine("$it")
        }
        appendLine("--------------------")
    }
    override fun push(element: T) {
        TODO("Not yet implemented")
    }

    override fun pop(): T? {
        TODO("Not yet implemented")
    }
}