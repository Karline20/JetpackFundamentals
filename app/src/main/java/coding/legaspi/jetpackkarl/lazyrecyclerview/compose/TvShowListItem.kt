package coding.legaspi.jetpackkarl.lazyrecyclerview.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coding.legaspi.jetpackkarl.lazyrecyclerview.model.TvShow

/**
 * Created by Karlen Legaspi
 */

@Composable
fun TvShowListItem(tvShow: TvShow, selectedItem: (TvShow) -> Unit){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .clickable { selectedItem(tvShow) },
            verticalAlignment = Alignment.CenterVertically
        ){
            // in xml this TvShowImage is most likely in the start and center vertically
            TvShowImage(tvShow = tvShow)
            // in xml this Column is most likely after the TvShowImage in a horizontal view and it calls it here RowScope
            Column {
                Text(
                    text = tvShow.name,
                    style = MaterialTheme.typography.headlineSmall
                )
                Spacer(
                    modifier = Modifier
                        .height(4.dp)
                )
                Text(
                    text = tvShow.overview,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = tvShow.year.toString(), style = MaterialTheme.typography.bodyMedium)
                    Text(text = tvShow.rating.toString(), style = MaterialTheme.typography.bodyMedium)
                }

            }
        }
    }
}
