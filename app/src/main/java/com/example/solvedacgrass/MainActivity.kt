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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.solvedacgrass.presentation.Screen
import com.example.solvedacgrass.presentation.grass.GrassScreen
import com.example.solvedacgrass.presentation.login.LoginScreen
import com.example.solvedacgrass.presentation.login.LoginViewModel
import com.example.solvedacgrass.presentation.splash.SplashScreen
import com.example.solvedacgrass.presentation.statistics.StatisticsScreen
import com.example.solvedacgrass.presentation.tip.TipScreen
import com.example.solvedacgrass.ui.theme.SolvedacGrassTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
    val loginViewModel: LoginViewModel = hiltViewModel()
    Surface {
        NavHost(
            navController = navController,
            startDestination = Screen.Splash.route
        ) {
            composable(Screen.Splash.route) {
                SplashScreen(modifier) {
                    navigate(navController, Screen.Login.route, Screen.Splash.route)
                }
            }
            composable(Screen.Login.route) {
                LoginScreen(modifier, loginViewModel) {
                    navigate(navController, Screen.Grass.route, Screen.Login.route)
                }
            }
            composable(Screen.Grass.route) { GrassScreen(modifier) }
            composable(Screen.Statistics.route) { StatisticsScreen() }
            composable(Screen.Tip.route) { TipScreen() }
        }
    }
}

private fun navigate(navController: NavHostController, toTag: String, popupTag: String? = null) {
    navController.navigate(toTag) {
        popupTag?.let {
            popUpTo(it) {
                inclusive = true
            }
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