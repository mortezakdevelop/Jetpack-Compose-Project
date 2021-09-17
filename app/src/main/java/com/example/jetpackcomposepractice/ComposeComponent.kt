package com.example.jetpackcomposepractice

import android.widget.RemoteViews
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

@Composable
fun myRow() {
    Row {
        myText()
    }
}

@Composable
fun myText(modifier: Modifier = Modifier()) {
    Column() {
        Text(
            text = "Hello jetpack Compose",
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        Text(
            text = "this is practice for learning android ui with jetpack compose",
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Text(
            text = "android ui with jetpack compose is very like flutter ui design and i like them" +
                    "maybe i learn flutter and android with them both i should see condition",
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = Color.Gray,

            )
    }
 }
@Composable
fun myProfile(modifier: Modifier = Modifier) {
    
}
