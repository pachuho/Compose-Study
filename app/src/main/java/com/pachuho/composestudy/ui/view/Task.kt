package com.pachuho.composestudy.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pachuho.composestudy.R
import com.pachuho.composestudy.ui.theme.ComposeStudyTheme

class Task {
    @Composable
    fun TaskManagerComplete() {
        Surface {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_task_completed),
                    contentDescription = ""
                )

                Text(
                    text = stringResource(R.string.text4),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                )

                Text(
                    text = stringResource(R.string.text5),
                    fontSize = 16.sp
                )
            }
        }
    }

    @Composable
    @Preview(showBackground = true, widthDp = 400, heightDp = 800)
    fun TaskManagerCompletePreview() {
        ComposeStudyTheme {
            TaskManagerComplete()
        }
    }
}