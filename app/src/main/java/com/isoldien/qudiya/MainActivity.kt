package com.isoldien.qudiya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isoldien.qudiya.theme.QudiyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QudiyaTheme {
                if (isSystemInDarkTheme()) {
                    Title("Welcome", "to Tung Tung Sahur")
                }
            }
        }
    }
}

@Composable
fun Title(text: String, text2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxWidth()
        .padding(100.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Blue,
            fontSize = 50.sp
        )
        Text(
            text = text2,
            style = MaterialTheme.typography.titleMedium,
            color = Color.Red,
            fontSize = 30.sp
        )
    }
}