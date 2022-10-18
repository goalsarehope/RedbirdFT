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
fun LoginView(
    navigateToHome: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Login View", fontSize = 40.sp)

        Button(
            text = "Log In",
            onClick = navigateToHome
        )
    }
}
