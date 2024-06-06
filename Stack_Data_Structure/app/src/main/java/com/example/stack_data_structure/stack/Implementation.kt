package com.example.stack_data_structure.stack

class Implementation<T : Any> :stack<T> {
    val storage = arrayListOf<T>()
    override fun toString() = buildString {
        appendLine("-------Top---------")
        storage.reversed().forEach {
            appendLine("$it")
        }
        appendLine("--------------------")
    }

    override fun push(element: T) {
        storage.add(element)

    }

    override fun pop(): T? {
       return if (storage.size == 0) {
           null
        } else {
            storage.removeAt(storage.size - 1)
        }
    }
    }

