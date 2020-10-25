import java.util.*
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue

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

    override fun print_details() = println("ID= ${ID},\n Name= ${name},\n Adresse= ${adresse},\n")

    override fun tax_charge() =
        when(super.Salary){
            in 0..7000 -> 0.0
            in 7001..12000-> if(this.num_mineur_child < 5) super.Salary*0.07 else super.Salary*0.02
            in 12001..15000->if(this.num_mineur_child < 7) super.Salary*0.09 else super.Salary*0.04
            else -> 0.0 }

    override fun max_Donation() =
        when(super.Salary){
            in 0..7000 -> if(this.num_mineur_child < 3 )0.6 * super.Salary+ 250*this.num_mineur_child else super.Salary * 1.0+ 250*this.num_mineur_child
            in 7001..12000-> if(this.num_mineur_child < 5) super.Salary*0.05 + 250*this.num_mineur_child else super.Salary*0.15 + 250*this.num_mineur_child
            in 12001..15000->if(this.num_mineur_child < 7) 0.0+ 250*this.num_mineur_child else super.Salary*0.1+ 250*this.num_mineur_child
            else -> 250.0*this.num_mineur_child
        }

    override fun help_hours()  =
        when(this.num_mineur_child) {
            in 0..2 -> if (this.max_Donation() < 1000) 5 else 15
            in 3..4 -> if (this.max_Donation() < 2000) 3 else 10
            else->0
        }
}