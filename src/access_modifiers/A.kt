package access_modifiers

class A {

    var age: Int = 0
//        set(value) {
//        field = if (value in 1..60){
//            value
//        }else{
//            0
//        }
//    }
    private set
}