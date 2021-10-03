package org.somenath1435.mathlibs

class CustomMaths {
    companion object {
        @JvmStatic
        fun add(x: Int, y: Int): Int {
            return x + y
        }

        @JvmStatic
        fun sub(x: Int, y: Int): Int {
            return x - y
        }

        @JvmStatic
        fun mul(x: Int, y: Int): Int {
            return x * y
        }

        @JvmStatic
        fun div(x: Int, y: Int): Int {
            return x / y
        }
    }
}