package com.example.fishcardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fishcardapp.R

@Composable
fun TopBarComponent(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.dp),
        horizontalArrangement = Arrangement.Center,
    ) {
        Image(
            modifier = Modifier
                .size(width = 200.dp, height = 60.dp),
            painter = painterResource(id = R.drawable.ic_logo2),
            contentDescription ="topBarLogo"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarComponentPreview(){
    TopBarComponent()
}
