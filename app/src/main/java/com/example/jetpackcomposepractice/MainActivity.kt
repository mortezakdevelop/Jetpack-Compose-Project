package com.example.jetpackcomposepractice


import android.graphics.Color.blue
import android.graphics.Color.red
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

import android.graphics.Color.green as green1

import androidx.activity.compose.setContent
import androidx.annotation.ArrayRes
import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.End

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.layout.MainAxisAlignment
import org.intellij.lang.annotations.JdkConstants


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showFlag()
        }
    }
}

@Composable
private fun showFlag(modifier: Modifier = Modifier) {
    Column(
        //1
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        //2
        horizontalAlignment = Alignment.CenterHorizontally,
        //3
        modifier = modifier.fillMaxSize()

    ) {
        androidx.compose.material.Surface(
            modifier = modifier
                .size(200.dp, 50.dp)
                .align(Alignment.Start), color = Color.Blue
        ) {
        }
        androidx.compose.material.Surface(
            modifier = modifier
                .size(200.dp, 50.dp)
                .align(Alignment.CenterHorizontally), color = Color.Green
        ) {
        }
        androidx.compose.material.Surface(
            modifier = modifier
                .size(200.dp, 50.dp)
                .align(Alignment.End), color = Color.Red
        ) {
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun showDefault() {
    showFlag()
}




