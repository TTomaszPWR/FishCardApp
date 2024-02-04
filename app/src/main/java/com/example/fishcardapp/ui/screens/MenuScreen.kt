package com.example.fishcardapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fishcardapp.R
import com.example.fishcardapp.ui.components.MenuCardComponent
import com.example.fishcardapp.ui.components.TopBarComponent

@Composable
fun MenuScreen(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 30.dp)
        ) {
            TopBarComponent()
            Spacer(modifier = Modifier.size(35.dp))
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.size(5.dp))
                Row {
                    MenuCardComponent(color = Color(0xFFE7ABDF), image = R.drawable.it_icon, "IT")
                    Spacer(modifier = Modifier.weight(1f))
                    MenuCardComponent(
                        color = Color(0xFFE7ABDF),
                        image = R.drawable.it_icon,
                        "Family"
                    )
                }
                Spacer(modifier = Modifier.size(40.dp))
                Row {
                    MenuCardComponent(color = Color(0xFFE7ABDF), image = R.drawable.it_icon, "IT")
                    Spacer(modifier = Modifier.weight(1f))
                    MenuCardComponent(
                        color = Color(0xFFE7ABDF),
                        image = R.drawable.it_icon,
                        "Family"
                    )
                }
                Spacer(modifier = Modifier.size(40.dp))
                Row {
                    MenuCardComponent(color = Color(0xFFE7ABDF), image = R.drawable.it_icon, "IT")
                    Spacer(modifier = Modifier.weight(1f))
                    MenuCardComponent(
                        color = Color(0xFFE7ABDF),
                        image = R.drawable.it_icon,
                        "Family"
                    )
                }
                Spacer(modifier = Modifier.size(40.dp))
                Row {
                    MenuCardComponent(color = Color(0xFFE7ABDF), image = R.drawable.it_icon, "IT")
                    Spacer(modifier = Modifier.weight(1f))
                    MenuCardComponent(
                        color = Color(0xFFE7ABDF),
                        image = R.drawable.it_icon,
                        "Family"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MenuScreenPreview(){
    MenuScreen()
}

