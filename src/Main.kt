import java.util.*
import Marry as Marry

fun main(){
    val batiste : Marry =
        Marry("1112",Gender.Man,"batiste","5's Avenue, New York, UNited state",Date(1999,11,17),
            20,39,120000,"555",10)
    val gerome : Marry =
        Marry("1112",Gender.Man,"gerome","6's Avenue, New York, UNited state",Date(1989,6,11),
            20,39,12000,"555",4)
    val comunity = Comunity()
    comunity.add_member(batiste)
    comunity.print_all()
    println("part2")
    comunity.add_member(gerome)
    comunity.print_all()

    for(member in comunity.list_member)
        println("name : ${member.name}, tax per mounth: ${member.tax_charge()} , donation affilation : ${member.max_Donation()}")
}