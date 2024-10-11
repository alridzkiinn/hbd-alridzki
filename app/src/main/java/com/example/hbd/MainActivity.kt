package com.example.hbd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.hbd.ui.theme.HbdTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HbdTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Alridzki", // Ganti dengan nama yang sesuai
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Menggunakan Box untuk memposisikan konten di tengah
    Box(
        contentAlignment = Alignment.Center, // Posisikan teks di tengah
        modifier = modifier
    ) {
        // Ubah warna teks dan ukuran font di sini
        Text(
            text = "Happy Birthday $name!",
            color = Color.Red, // Ubah warna teks
            fontSize = 30.sp,  // Ubah ukuran font (misalnya 30sp)
            fontWeight = FontWeight.Bold // Menambahkan ketebalan teks (opsional)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HbdTheme {
        Greeting("Alridzki") // Ganti dengan nama yang sesuai
    }
}
