package code.namanbir.gitfit.app.data.network

class ApiHelper(private val apiInterface: ApiInterface) {

    suspend fun getUser(user : String) = apiInterface.getUser(user)

    suspend fun getRepo(user: String) = apiInterface.getRepos(user)

}