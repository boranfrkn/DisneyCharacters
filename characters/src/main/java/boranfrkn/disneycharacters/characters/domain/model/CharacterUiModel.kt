package boranfrkn.disneycharacters.characters.domain.model

data class CharacterUiModel(
    val allies: List<String>,
    val enemies: List<String>,
    val films: List<String>,
    val imageUrl: String,
    val name: String,
    val parkAttractions: List<String>,
    val shortFilms: List<String>,
    val tvShows: List<String>,
    val url: String,
    val videoGames: List<String>,
)
