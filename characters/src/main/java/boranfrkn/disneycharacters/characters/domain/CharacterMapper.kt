package boranfrkn.disneycharacters.characters.domain

import boranfrkn.disneycharacters.characters.domain.model.CharacterUiModel
import boranfrkn.disneycharacters.data.response.CharacterResponse
import javax.inject.Inject

class CharacterMapper @Inject constructor() {
    fun mapFromResponse(item: CharacterResponse): CharacterUiModel {
        return CharacterUiModel(
            allies = mapList(item.allies),
            enemies = mapList(item.enemies),
            films = mapList(item.films),
            imageUrl = item.imageUrl.orEmpty(),
            name = item.name.orEmpty(),
            parkAttractions = mapList(item.parkAttractions),
            shortFilms = mapList(item.shortFilms),
            tvShows = mapList(item.tvShows),
            url = item.url.orEmpty(),
            videoGames = mapList(item.tvShows)
        )
    }

    private fun mapList(listItem: List<String?>?): List<String> {
        return listItem?.map { it.orEmpty() }.orEmpty()
    }
}