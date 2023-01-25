package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background){
                     JetpackApp()
                }
            }
        }
    }
}


@Composable
fun JetpackApp(){
    JetpackComposeText(
        title = stringResource(R.string.jetpack_title),
        firstBody = stringResource(R.string.jetpack_first_body),
        secondBody = stringResource(R.string.jetpack_second_body),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )

}

@Composable
private fun JetpackComposeText(
    title: String,
    firstBody: String,
    secondBody: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column (modifier = modifier){
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = firstBody,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = secondBody,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
        )
    }
}


@Preview(showBackground = true)
@Composable
fun JetpackComposePreview() {
    JetpackComposeTutorialTheme {
        JetpackApp()
    }
}