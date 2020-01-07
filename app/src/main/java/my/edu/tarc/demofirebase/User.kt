package my.edu.tarc.demofirebase


data class User (
    var name: String? = "",
    var phone: String? ="",
    val created_at: Long =  System.currentTimeMillis()
)