package boranfrkn.disneycharacters.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import boranfrkn.disneycharacters.data.datasource.CharacterPagingDataSource
import boranfrkn.disneycharacters.data.response.CharacterResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CharactersRepository @Inject constructor(
    private val characterPagingDataSource: CharacterPagingDataSource,
    private val coroutineScope: CoroutineScope
) {
    fun fetchAllCharacters(): Flow<PagingData<CharacterResponse>> {
        return Pager(
            config = PagingConfig(pageSize = 20)
        ) {
            characterPagingDataSource
        }.flow.cachedIn(coroutineScope)
    }
}