class Comunity(vararg comunityMember: Comunity_Member) {
    var list_member : MutableList<Comunity_Member> = mutableListOf()

    fun add_member(comunityMember: Comunity_Member){
        this.list_member.add(comunityMember)
    }
    fun total_tax():Int{
        var total= 0
        for(member in list_member)
            total += member.tax_charge()

        return total
    }
    fun donation_availbility (comunityMember: Comunity_Member) : Double
            = when(comunityMember.Salary){
            in 0..7000 -> 4000.0
            in 7001..12000-> 1500.0
            in 12001..15000->750.0
            else -> 0.0 }
    fun order_list_helping_hours(){
        TODO("don't understand")
    }
}