
package coding.legaspi.jetpackkarl.snackbar

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coding.legaspi.jetpackkarl.ui.theme.JetpackKarlTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class SnackBarDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackKarlTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplaySnackbar()
                }
            }

        }
    }
}

@Composable
fun DisplaySnackbar(){
    val snackbarHostState  = remember { SnackbarHostState() }
    val coroutineScope : CoroutineScope = rememberCoroutineScope()

    Scaffold(snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            Button(
                shape = CutCornerShape(10.dp),
                onClick = {
                coroutineScope.launch {
                    val snackBarResult = snackbarHostState.showSnackbar(
                        message = "This is the message",
                        actionLabel = "Undo",
                        duration = SnackbarDuration.Long
                    )

                    when(snackBarResult){
                        SnackbarResult.ActionPerformed -> Log.i("MYTAG", "Action label clicked!")
                        SnackbarResult.Dismissed -> Log.i("MYTAG", "Action label dismissed!")
                    }
                }
            }) {
                Text(text = "Display snackbar")
            }
        },
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets,
        content = {
            innerPadding ->
            Text(
                text = "Snackbar demo",
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .wrapContentSize()
                )
        })
}

@Preview(showBackground = true)
@Composable
fun DisplaySnackbarPreview(){
    JetpackKarlTheme {
        DisplaySnackbar()
    }
}