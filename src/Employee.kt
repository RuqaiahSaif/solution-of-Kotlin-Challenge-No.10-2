class Employee(var firstName:String="",var lastName: String="",var id_Employee: String="",
                        var isManager:Boolean=false,var managerId:String=""){
    fun setFirstName(name:String):Employee{
        firstName=name
        return this

    }
    fun setLirstName(name:String):Employee{
        lastName=name
        return this

    }
    fun setId(id:String):Employee{
        id_Employee=id
        return this

    }

    fun setIsManage(a:Boolean):Employee{
        isManager=a
        return this

    }
    fun setManagerId(b:String):Employee{
        managerId=b
        return this

    }
}

fun main() {
    val employee= Employee()
         .setFirstName("Daug")
        .setLirstName("Sigelbaum")
        .setIsManage(false)
        .setManagerId("XXX")

}