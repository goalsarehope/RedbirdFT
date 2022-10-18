package com.redbird.ft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.redbird.ft.ui.theme.RedbirdFTTheme
import com.redbird.ft.ui.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen() {
    RedbirdFTTheme {
        val navController = rememberNavController()
        NavGraph(navController)
    }
}