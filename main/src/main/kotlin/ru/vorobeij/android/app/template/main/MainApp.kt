package ru.vorobeij.android.app.template.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.vorobeij.android.app.template.main.theme.androidAppTemplateTheme

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun mainApp() {
    androidAppTemplateTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            greeting("Android")
        }
    }
}

@Composable
fun greeting(name: String) {
    Text(text = "Hello $name!")
}
