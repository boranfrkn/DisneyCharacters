package boranfrkn.disneycharacters.charactercard

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CharacterCard() {
    Card {
        Text("Card")
    }
}

@Preview
@Composable
fun CharacterCardPreview() {
    CharacterCard()
}