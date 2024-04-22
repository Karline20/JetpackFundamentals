package coding.legaspi.jetpackkarl.boxexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coding.legaspi.jetpackkarl.R
import coding.legaspi.jetpackkarl.ui.theme.JetpackKarlTheme

class BoxExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxExample3()
        }
    }
}

@Composable
fun BoxExample1() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(180.dp, 300.dp)
    ){
        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(125.dp, 100.dp)
                .align(Alignment.TopEnd)
        ){

        }
        Text(
            text = "Yow",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.White)
                .size(90.dp, 50.dp)
                .align(Alignment.BottomCenter)
        )

    }
}

@Composable
fun BoxExample2(){
    Box(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize()
    ){
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopEnd),
            text = "TopEnd"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopStart),
            text = "TopStart"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopCenter),
            text = "TopCenter"
        )

        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterStart),
            text = "CenterStart"
        )

        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.Center),
            text = "Center"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterEnd),
            text = "CenterEnd"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomStart),
            text = "BottomStart"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomEnd),
            text = "BottomEnd"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomCenter),
            text = "BottomCenter"
        )

    }
}

@Composable
fun BoxExample3(){
    Box (

    ){
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "Background"
        )
        Text(
            text = "Background",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomStart)
            )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.White,
                contentColor = Color.DarkGray
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .border(5.dp, Color.DarkGray, RectangleShape)
        ) {
            Text(
                text = "Add to Cart"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExamplePreview() {
    JetpackKarlTheme {
        BoxExample1()
    }
}