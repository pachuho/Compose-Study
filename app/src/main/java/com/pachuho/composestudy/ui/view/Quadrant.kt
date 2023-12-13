package com.pachuho.composestudy.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pachuho.composestudy.R
import com.pachuho.composestudy.ui.theme.Color1
import com.pachuho.composestudy.ui.theme.Color2
import com.pachuho.composestudy.ui.theme.Color3
import com.pachuho.composestudy.ui.theme.Color4
import com.pachuho.composestudy.ui.theme.ComposeStudyTheme

class Quadrant {
    @Composable
    fun composeQuadrant(modifier: Modifier) {
        Surface {
            Column {
                Row(modifier = Modifier.weight(1f)) {
                    Column(modifier = Modifier.weight(1f)) {
                        composeCard(modifier, Color1, R.string.quardrant_text_1_main, R.string.quardrant_text_1_sub)
                    }

                    Column(modifier = Modifier.weight(1f)) {
                        composeCard(modifier, Color2, R.string.quardrant_text_2_main, R.string.quardrant_text_2_sub)
                    }
                }

                Row(modifier = Modifier.weight(1f)) {
                    Column(modifier = Modifier.weight(1f)) {
                        composeCard(modifier, Color3, R.string.quardrant_text_3_main, R.string.quardrant_text_3_sub)
                    }

                    Column(modifier = Modifier.weight(1f)) {
                        composeCard(modifier, Color4, R.string.quardrant_text_4_main, R.string.quardrant_text_4_sub)
                    }
                }
            }

        }
    }

    @Composable
    fun composeCard(
        modifier: Modifier,
        color: Color,
        textMain: Int,
        textSub: Int
    ) {
        Column(
            modifier = modifier.fillMaxHeight().background(color),
            verticalArrangement = Arrangement.Center,
        ) {
            Column(
                Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                composeTextMain(textMain)
                composeTextSub(textSub)
            }
        }

    }

    @Composable
    fun composeTextMain(text: Int) {
        Text(
            text = stringResource(id = text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }

    @Composable
    fun composeTextSub(text: Int) {
        Text(
            text = stringResource(id = text),
            textAlign = TextAlign.Justify
        )
    }


    @Composable
    @Preview(showBackground = true, widthDp = 400, heightDp = 800)
    fun ComposeQuadrantPreView() {
        ComposeStudyTheme {
            composeQuadrant(modifier = Modifier.fillMaxSize())
        }
    }

}