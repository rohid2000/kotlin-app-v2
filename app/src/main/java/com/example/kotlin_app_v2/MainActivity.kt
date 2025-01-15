package com.example.kotlin_app_v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_app_v2.ui.theme.Kotlinappv2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlinappv2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top // Changed to Top
    ) {
        Text(
            text = "Loan Vehicle App",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(onClick = { /*TODO: Implement loan application navigation*/ },
            modifier = Modifier.fillMaxWidth(0.8f).padding(bottom = 16.dp)
        ) {
            Text("Loan a Vehicle")
        }

        Button(onClick = { /*TODO: Implement loan status navigation*/ },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text("Loan Vehicle Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Kotlinappv2Theme {
        HomeScreen()
    }
}