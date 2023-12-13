package com.pachuho.composestudy.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
    fun composeQuadrant() {
        Column(Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.weight(1f)) {
                composeCard(
                    Modifier.weight(1f),
                    Color1,
                    stringResource(id = R.string.quardrant_text_1_main),
                    stringResource(id = R.string.quardrant_text_1_sub)
                )


                composeCard(
                    Modifier.weight(1f),
                    Color2,
                    stringResource(id = R.string.quardrant_text_2_main),
                    stringResource(id = R.string.quardrant_text_2_sub)
                )
            }

            Row(modifier = Modifier.weight(1f)) {
                composeCard(
                    Modifier.weight(1f),
                    Color3,
                    stringResource(id = R.string.quardrant_text_3_main),
                    stringResource(id = R.string.quardrant_text_3_sub)
                )

                composeCard(
                    Modifier.weight(1f),
                    Color4,
                    stringResource(id = R.string.quardrant_text_4_main),
                    stringResource(id = R.string.quardrant_text_4_sub)
                )
            }
        }
    }

    @Composable
    fun composeCard(
        modifier: Modifier,
        color: Color,
        title: String,
        description: String
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }

    }

    @Composable
    @Preview(showBackground = true, widthDp = 400, heightDp = 800)
    fun ComposeQuadrantPreView() {
        ComposeStudyTheme {
            composeQuadrant()
        }
    }

}