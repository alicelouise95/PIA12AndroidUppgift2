package com.example.pia12androiduppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pia12androiduppgift2.ui.theme.PIA12AndroidUppgift2Theme

@Composable
fun RowItem(text: String) {
    Row(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .background(Color.LightGray),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun RowItemPreview() {
    PIA12AndroidUppgift2Theme {
        RowItem(text = "")
    }
}