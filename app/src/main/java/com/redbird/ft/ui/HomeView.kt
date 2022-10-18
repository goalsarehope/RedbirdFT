package com.redbird.ft.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.redbird.ft.ui.components.Button

@Composable
fun HomeView(
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit,
) {

    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Home View", fontSize = 40.sp)

        Button(
            text = "Back",
            onClick = popBackStack
        )

        Button(
            text = "Log Out",
            onClick = popUpToLogin
        )
    }
}
