package com.example.hbd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    // Memanggil gambar dari drawable
    val image: Painter = painterResource(id = R.drawable.mrbean) // Ganti 'your_image' dengan nama file gambar di drawable

    // Menggunakan Column untuk menyusun gambar dan teks secara vertikal
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Posisikan konten di tengah
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = "Birthday Image", // Tambahkan deskripsi gambar
            modifier = Modifier.size(300.dp) // Atur ukuran gambar sesuai kebutuhan
        )
        Spacer(modifier = Modifier.height(16.dp)) // Spasi antara gambar dan teks
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
