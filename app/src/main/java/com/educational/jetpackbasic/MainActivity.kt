package com.educational.jetpackbasic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.educational.jetpackbasic.component.BottomView
import com.educational.jetpackbasic.component.Toolbar
import com.educational.jetpackbasic.component.bottomView.BottomNavigationItem
import com.educational.jetpackbasic.navigation.SamNavigation
import com.educational.jetpackbasic.ui.theme.JetpackComposeBasicsmasterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            JetpackComposeBasicsmasterTheme {
                MainScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { Toolbar() }, bottomBar = { BottomView(navController) })
    { padding ->
        SamNavigation(navController = navController, BottomNavigationItem.Home.route,padding)
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBasicsmasterTheme {
        MainScreen()
    }
}