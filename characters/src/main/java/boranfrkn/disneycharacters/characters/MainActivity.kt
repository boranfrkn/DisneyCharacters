package boranfrkn.disneycharacters.characters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems
import boranfrkn.disneycharacters.charactercard.CharacterCard
import boranfrkn.disneycharacters.theme.DisneyCharactersTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: CharactersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyCharactersTheme {
                val state = viewModel.characters.value.collectAsLazyPagingItems()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(content = {
                        itemsIndexed(state.itemSnapshotList) { index, _ ->
                            CharacterCard(
                                imageUrl = state[index]?.imageUrl.orEmpty(),
                                name = state[index]?.name.orEmpty()
                            )
                        }
                    })
                }
            }
        }
    }
}
