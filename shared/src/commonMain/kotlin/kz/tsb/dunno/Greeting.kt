package kz.tsb.dunno

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}