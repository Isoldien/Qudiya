package com.isoldien.qudiya

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isoldien.qudiya.ui.theme.QudiyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Logo(title = stringResource(id = R.string.app_name))
        }
    }
}


@Composable
fun Logo(title: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .padding(60.dp)
        .fillMaxHeight()
        .fillMaxSize()
        .fillMaxWidth()
    ){
        Text(
            text = title,
            modifier = modifier,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            lineHeight = 30.sp,
            color = androidx.compose.ui.graphics.Color.Black,
            fontFamily = FontFamily.Serif
        )
    }
}