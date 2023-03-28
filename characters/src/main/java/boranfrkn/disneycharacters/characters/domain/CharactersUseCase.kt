package boranfrkn.disneycharacters.characters.domain

import androidx.paging.PagingData
import androidx.paging.map
import boranfrkn.disneycharacters.characters.domain.model.CharacterUiModel
import boranfrkn.disneycharacters.data.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CharactersUseCase @Inject constructor(
    private val charactersRepository: CharactersRepository,
    private val mapper: CharacterMapper
) {

    fun fetchAllCharacters(): Flow<PagingData<CharacterUiModel>> {
        return charactersRepository.fetchAllCharacters().map { pagingData ->
            pagingData.map { response ->
                mapper.mapFromResponse(response)
            }
        }
    }
}