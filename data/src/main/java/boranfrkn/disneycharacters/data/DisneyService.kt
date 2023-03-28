package boranfrkn.disneycharacters.data

import retrofit2.http.GET
import retrofit2.http.Query

interface DisneyService {
    @GET("characters")
    suspend fun fetchAllCharacters(@Query("page") page: Int)
}