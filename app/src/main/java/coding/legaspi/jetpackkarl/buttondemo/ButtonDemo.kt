package coding.legaspi.jetpackkarl.buttondemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coding.legaspi.jetpackkarl.ui.theme.JetpackKarlTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.RectangleShape

class ButtonDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonDemo1()
            }
        }
    }
}

@Composable
fun ButtonDemo1(){
    val context = LocalContext.current
    Button(
        onClick = {
        Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()
        },
    ) {
        Text(text = "Add to cart")
    }

    Button(
        onClick = {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()
        },
        enabled = false
    ) {
        Text(text = "Add to cart")
    }

    TextButton(
        onClick = {
            Toast.makeText(context, "Button Text clicked!", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text(text = "Add to cart")
    }

    OutlinedButton(
        onClick = {
            Toast.makeText(context, "Button Outlined clicked!", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text(text = "Add to cart")
    }

    IconButton(
        onClick = {
            Toast.makeText(context, "Button Icon clicked!", Toast.LENGTH_SHORT).show()
        }
    ) {
        Icon(
            Icons.Filled.Refresh,
            contentDescription = "Refresh button",
            tint = Color.DarkGray,
            modifier = Modifier
                .size(80.dp)
        )
    }

    Button(
        onClick = {
            Toast.makeText(context, "Button RectangleShape clicked!", Toast.LENGTH_SHORT).show()
        },
        shape = RectangleShape,
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text(
            text = "Add to cart",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(5.dp)
        )
    }

    Button(
        onClick = {
            Toast.makeText(context, "Button CutCornerShape clicked!", Toast.LENGTH_SHORT).show()
        },
        shape = CutCornerShape(10.dp),
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text(
            text = "Add to cart",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(5.dp)
        )
    }

    Button(
        onClick = {
            Toast.makeText(context, "Button CircleShape clicked!", Toast.LENGTH_SHORT).show()
        },
        shape = CircleShape,
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.DarkGray,
            contentColor = Color.White
        )
    ) {
        Text(
            text = "Add to cart",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(5.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ButtonDemoPreview(){
    JetpackKarlTheme {
        ButtonDemo1()
    }
}