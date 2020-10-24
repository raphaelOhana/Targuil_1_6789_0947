import java.util.*

class Marry(ID:String, gender:Gender, name: String, adresse:String, birthday: Date, torah_hours: Int, work_hour : Int, Salary:Int,  ID_partenaire:String , num_mineur_child:Int):
    Comunity_Member(ID, gender, name, adresse, birthday, torah_hours, work_hour, Salary) {
    var ID_partenaire: String = ID_partenaire
        get() = field
        private set(value) {
            field = value
        }
    var num_mineur_child: Int = num_mineur_child
        get() = field
        private set(value) {
            field = value
        }
    override fun tax_charge(): Int {
        TODO("must learn") //To change body of created functions use File | Settings | File Templates.
    }

    override fun max_Donation(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun help_hours(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}