class Comunity(vararg comunityMember: Comunity_Member) {
    var list_member : MutableList<Comunity_Member> = mutableListOf()

    fun add_member(community_member: Comunity_Member){
        this.list_member.add(community_member)
    }
    fun total_tax():Double{
        var total= 0.0
        for(member in list_member)
            total += member.tax_charge()

        return total
    }
    fun donation_availbility (community_member: Comunity_Member) =
        when(community_member.Salary){
            in 0..7000 -> 4000.0
            in 7001..12000-> 1500.0
            in 12001..15000->750.0
            else -> 0.0 }
    fun order_list_helping_hours(){
        TODO("don't understand")
    }
    fun print_all(){
        for(member in list_member)
            member.print_details()
    }
}