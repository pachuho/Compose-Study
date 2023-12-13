package com.pachuho.composestudy.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pachuho.composestudy.R
import com.pachuho.composestudy.ui.theme.ComposeStudyTheme

class Article {
    @Composable
    fun composeArticle() {
        Surface {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.bg_compose_background),
                    contentDescription = "compose background"
                )

                Text(
                    text = stringResource(R.string.text1),
                    fontSize = 24.sp,
                    modifier = Modifier.padding(16.dp)
                )

                Text(
                    text = stringResource(R.string.text2),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Text(
                    text = stringResource(R.string.text3),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )

            }
        }
    }

    @Preview(showBackground = true, widthDp = 400, heightDp = 800)
    @Composable
    fun ComposeArticlePreview() {
        ComposeStudyTheme {
            composeArticle()
        }
    }
}