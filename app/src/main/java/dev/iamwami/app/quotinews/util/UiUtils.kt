package dev.iamwami.app.quotinews.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import dev.iamwami.app.quotinews.R
import dev.iamwami.app.quotinews.model.News

//TODO find the best way to work around passing modifier as an arguement.

@Composable
fun NewsImage(
    modifier: Modifier = Modifier.clip(shape = MaterialTheme.shapes.medium),
    newsData: News,
    contentDescription: String = "preview image from the news source"
) {
    AsyncImage(
        model = newsData.articles?.get(0)?.urlToImage,
        contentDescription = contentDescription,
        modifier = modifier,
        placeholder = painterResource(id = R.drawable.news_article_image_placeholder_two),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun LikeBtn(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    IconButton(
        onClick = {
//            Toast.makeText(context, "Functionality not available", Toast.LENGTH_SHORT).show()
        }
    ) {
        Icon(Icons.Outlined.FavoriteBorder, contentDescription = "Heart icon for favourite news")
    }
}

/* full width divider with padding*/
@Composable
fun PostDivider() {
    Divider(
        modifier = Modifier
            .padding(14.dp),
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
    )
}