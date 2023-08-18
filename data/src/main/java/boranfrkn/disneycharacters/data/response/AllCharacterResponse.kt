package boranfrkn.disneycharacters.data.response


import com.google.gson.annotations.SerializedName

data class AllCharacterResponse(
    @SerializedName("data")
    val data: List<CharacterResponse>?,
    @SerializedName("info")
    val pagingInfoResponse: PagingInfoResponse?
)