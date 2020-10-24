import java.util.*

class single(ID:String, gender:Gender,  name: String, adresse:String,  birthday: Date,  torah_hours: Int,  work_hour : Int,  Salary:Int , years_study:Int):
    Comunity_Member(ID, gender, name, adresse, birthday, torah_hours, work_hour, Salary) {
    var years_study :Int =years_study
        get() = field
        set(value) {field =value}

    override fun tax_charge(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun max_Donation(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun help_hours(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}