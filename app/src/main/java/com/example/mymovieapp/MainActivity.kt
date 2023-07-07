package com.example.mymovieapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymovieapp.ui.theme.MyMovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myapp {
                Maincontent()
            }

        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Myapp(content: @Composable () -> Unit){
    MyMovieAppTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor = androidx.compose.ui.graphics.Color.White,
                    elevation = 5.dp
                )
                {
                    Text(text = "Movie" )
                }
            }
        ){

        }

    }
}

@Composable
fun Maincontent(){
    Surface(color = MaterialTheme.colors.background) {
        Text(text = "Hello")
        
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Myapp {
        Maincontent()

    }
}