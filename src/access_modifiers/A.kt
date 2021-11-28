package access_modifiers

class A {

    var age: Int = 0
        set(value) {
        field = if (value in 1..49){
            value
        }else{
            0
        }
    }
}