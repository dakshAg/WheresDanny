package au.edu.unimelb.wheresdanny.data

data class User(
    val email: String,
    val username: String?,
    val password: String?,
    val name: String?,
    val about: String?,
    val hashtags: String?,
    val currentJobTitle: String?,
    val experience: String?,
)
