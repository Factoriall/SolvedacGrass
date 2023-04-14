package com.example.solvedacgrass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.solvedacgrass.ui.theme.SolvedacGrassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MainApp {
                MainContent()
            }
        }
    }
}

@Composable
fun MainApp(content: @Composable () -> Unit) {
    SolvedacGrassTheme() {
        Scaffold(containerColor = MaterialTheme.colorScheme.background,
            content = {
                content()
            }
        )
    }
}

@Composable
private fun MainContent() {
    val navController = rememberNavController()
    val modifier = Modifier
    val loginViewModel: LoginViewModel = viewModel()
    Surface {
        NavHost(
            navController = navController,
            startDestination = Screen.Splash.route
        ) {
            composable(Screen.Splash.route) {
                SplashScreen(modifier) {
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Splash.route) {
                            inclusive = true
                        }
                    }
                }
            }
            composable(Screen.Login.route) { LoginScreen(modifier, loginViewModel, {}) }
            composable(Screen.Grass.route) { GrassScreen() }
            composable(Screen.Statistics.route) { StatisticsScreen() }
            composable(Screen.Tip.route) { TipScreen() }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SolvedacGrassTheme {
        Greeting("Android")
    }
}