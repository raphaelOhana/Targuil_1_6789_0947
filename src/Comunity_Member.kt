import java.util.*

abstract class Comunity_Member (ID:String , gender:Gender,  name: String,  adresse:String,  birthday: Date,  torah_hours: Int,  work_hour : Int, Salary:Int) : Obligation{
    var ID : String = ID
        get() =  field
        private set(value) {field = value}
    var gender : Gender  = gender
        get() =  field
        private set(value) {field = value}
    var name : String = name
        get() =  field
        private set(value) {field = value}
    var adresse : String = adresse
        get() =  field
        private set(value) {field = value}
    var birthday : Date  = birthday
        get() =  field
        private set(value) {field = value}
    var torah_hours : Int = torah_hours
        get() =  field
        private set(value) {field = value}
    var work_hour : Int = work_hour
        get() =  field
        private set(value) {field = value}
    var Salary : Int  = Salary
        get() =  field
        private set(value) {field = value}

}