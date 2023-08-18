package boranfrkn.disneycharacters.data.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import boranfrkn.disneycharacters.data.DisneyService
import boranfrkn.disneycharacters.data.response.CharacterResponse
import javax.inject.Inject

class CharacterPagingDataSource @Inject constructor(
    private val disneyService: DisneyService
): PagingSource<Int, CharacterResponse>() {
    override fun getRefreshKey(state: PagingState<Int, CharacterResponse>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CharacterResponse> {
        return try {
            val nextPage = params.key ?: 1
            val characterResponse = disneyService.fetchAllCharacters(nextPage)

            LoadResult.Page(
                data = characterResponse.data ?: listOf(),
                prevKey = if (nextPage == 1) null else nextPage - 1 ,
                nextKey = if (nextPage < (characterResponse.pagingInfoResponse?.totalPages ?: 1))
                    nextPage.plus(1) else null
            )
        }catch (e: Exception){
            LoadResult.Error(e)
        }
    }
}