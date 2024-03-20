//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mercy = Banker("Mercy",40)
    mercy.talk("Hello there")
    mercy.eat()
    var amt = mercy.countMoney(arrayOf(100,200,300,400,500))


    val Rehema = Doctors("Rehema",50)
    Rehema.talk("Hello there")
    Rehema.eat()
    Rehema.treatPatient("Wanjiku","Malaria")

    val Faith = Farmer("Faith",40)
    Faith.talk("")}



   open class person( var name:String , val age:Int){
    fun talk(words:String){
        println(words)
    }
     open fun eat(){
        println("yam")
    }
    fun sleep(){
        println("zzzzzzzz")

}


       }

class Banker(name:String,age:Int):person(name,age){


    fun countMoney(notes:Array<Int>):Int{
        var sum= 0
        notes.forEach{note->sum+=note}
        return sum
    }
}

class Doctors(name:String, age:Int,):person(name,age){

    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease")
    }
}

class Farmer(name:String,age:Int):person(name,age){

    fun cultivate(){
        println{"dig dig dig"}
    }
    fun introduction(){
        println("Hi I am $name")
    }


    override fun eat(){
        super.eat()
        println("I will reap what I planted soon")

    }


}
