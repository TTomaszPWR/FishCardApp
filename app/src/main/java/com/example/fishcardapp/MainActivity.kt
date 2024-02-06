package com.example.fishcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.fishcardapp.ui.screens.FlashCardsNavigationGraph
import com.example.fishcardapp.ui.theme.FlashCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            FlashCardAppTheme {
                FlashCardsApp()
            }
        }
    }

    @Composable
    private fun FlashCardsApp() {
        FlashCardsNavigationGraph()
    }
}
