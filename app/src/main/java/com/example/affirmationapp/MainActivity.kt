package com.example.affirmationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.affirmationapp.models.Affirmation
import com.example.affirmationapp.ui.theme.AffirmationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun AffirmationApp(modifier: Modifier = Modifier) {


}

@Composable
fun AffirmationCard(Affirmation: Affirmation ,modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(id = Affirmation.imageId),
            contentDescription = null,
            modifier = Moodifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .
        )
    }

}