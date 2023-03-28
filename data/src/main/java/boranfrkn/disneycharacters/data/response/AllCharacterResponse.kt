package boranfrkn.disneycharacters.data.response


import com.google.gson.annotations.SerializedName

data class AllCharacterResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("data")
    val data: List<CharacterResponse>?,
    @SerializedName("nextPage")
    val nextPage: String?,
    @SerializedName("totalPages")
    val totalPages: Int?
)