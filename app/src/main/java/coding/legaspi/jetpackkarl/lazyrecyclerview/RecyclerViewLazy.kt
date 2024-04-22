package coding.legaspi.jetpackkarl.lazyrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coding.legaspi.jetpackkarl.lazyrecyclerview.compose.TvShowListItem
import coding.legaspi.jetpackkarl.lazyrecyclerview.data.TvShowList
import coding.legaspi.jetpackkarl.lazyrecyclerview.model.TvShow
import coding.legaspi.jetpackkarl.ui.theme.JetpackKarlTheme

class RecyclerViewLazy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ScrollableColumnDemo()
//            LazyColumnDemo2{
//                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
//            }

            DisplayTvShows{
                Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
                startActivity(InfoActivity.intent(this, it))
            }
        }
    }
}
@Composable
fun ScrollableColumnDemo() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..100){
            Text(
                text = "User name $i",
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier.padding(10.dp)
            )
            Divider(color = Color.Black, thickness = 5.dp)
        }
    }

}

@Composable
fun LazyColumnDemo(){
    LazyColumn {
        items(100){
            Text(
                text = "User name $it",
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Composable
fun LazyColumnDemo2(selectedItem : (String) -> (Unit)){
    LazyColumn {
        items(100){
            Text(
                text = "User name $it",
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .padding(10.dp)
                    .clickable { selectedItem("$it selected") }
            )
        }
    }
}

@Composable
fun DisplayTvShows(selectedItem: (TvShow) -> Unit){

    val tvShows = remember{ TvShowList.tvShows}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = tvShows,
            itemContent = {
                TvShowListItem(tvShow = it, selectedItem)
            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackKarlTheme {
       //ScrollableColumnDemo()
        //LazyColumnDemo()
        //TvShowListItem()
    }
}