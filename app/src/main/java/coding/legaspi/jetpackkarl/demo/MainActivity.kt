package coding.legaspi.jetpackkarl.demo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coding.legaspi.jetpackkarl.ui.theme.JetpackKarlTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //vertically
            Column(
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally, //Center, Bottom, Top, SpaceEvenly, SpaceAround
                verticalArrangement = Arrangement.Center,
            ){
                Greeting("A")
                Greeting("AB")
                Greeting("ABC")
                ButtonClick()
            }


            //horizontal
//            Row(
//                modifier = Modifier
//                    .background(color = Color.LightGray)
//                    .fillMaxSize(),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ){
//                Greeting("A")
//                Greeting("AB")
//                Greeting("ABC")
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = name,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Yellow)
            .border(2.dp, color = Color.Red)
            .padding(10.dp)
    )
}

@Composable
fun ButtonClick(){
    Button(
        onClick = {
                  Log.d("APP TAG", "Button clicked!")
                  },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Green
        )
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackKarlTheme {
        Greeting("Karlen")
    }
}