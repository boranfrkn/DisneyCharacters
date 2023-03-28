package boranfrkn.disneycharacters.characters

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import boranfrkn.disneycharacters.characters.domain.CharactersUseCase
import boranfrkn.disneycharacters.characters.domain.model.CharacterUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersUseCase: CharactersUseCase
) : ViewModel() {

    private val _characters = mutableStateOf<Flow<PagingData<CharacterUiModel>>>(emptyFlow())
    val characters: State<Flow<PagingData<CharacterUiModel>>> = _characters

    init {
        getAllCharacters()
    }

    private fun getAllCharacters() {
        viewModelScope.launch {
            _characters.value = charactersUseCase.fetchAllCharacters()
        }
    }
}