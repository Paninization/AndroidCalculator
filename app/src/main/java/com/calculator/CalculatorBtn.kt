package com.calculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CalculartorButton(
    text: String,
    modifier: Modifier,
    fontSize:TextUnit = 20.sp,
    onClick: () -> Unit,
    function: () -> Unit
) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = text,
            fontSize = fontSize,
            color = Color.White,
        )
    }
//    Button(
//        onClick = onClick,
//        modifier = modifier,
//    ) {
//        Text(text = text)
//    }
}