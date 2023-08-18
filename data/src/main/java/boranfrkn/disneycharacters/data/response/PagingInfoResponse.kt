package boranfrkn.disneycharacters.data.response

import com.google.gson.annotations.SerializedName

data class PagingInfoResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("totalPages")
    val totalPages: Int?,
    @SerializedName("previousPage")
    val previousPage: String?,
    @SerializedName("nextPage")
    val nextPage: String?
)
