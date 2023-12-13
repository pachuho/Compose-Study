package com.pachuho.composestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.pachuho.composestudy.ui.view.CodeLab.MyApp
import com.pachuho.composestudy.ui.theme.ComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeStudyTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
//
//    @Preview
//    @Composable
//    fun MyAppPreview() {
//        ComposeStudyTheme {
//            MyApp(Modifier.fillMaxSize())
//        }
//    }
//
//    @Preview(showBackground = true, widthDp = 320, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "dark")
//    @Preview(showBackground = true, widthDp = 320)
//    @Composable
//    fun GreetingsPreview() {
//        ComposeStudyTheme {
//            CodeLab.Greetings()
//        }
//    }
//
//    @Preview(showBackground = true, widthDp = 320, heightDp = 320)
//    @Composable
//    fun OnBoardingPreview() {
//        ComposeStudyTheme {
//            CodeLab.OnboardScreen(onContinueClicked = {})
//        }
//    }
}
