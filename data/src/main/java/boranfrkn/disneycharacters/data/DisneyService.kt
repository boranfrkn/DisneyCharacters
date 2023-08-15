package boranfrkn.disneycharacters.data

import boranfrkn.disneycharacters.data.response.AllCharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DisneyService {
    @GET("character")
    suspend fun fetchAllCharacters(@Query("page") page: Int): AllCharacterResponse
}