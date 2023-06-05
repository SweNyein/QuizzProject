package com.example.quizproject.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BookListScreen () {


    Scaffold (

        containerColor = MaterialTheme.colorScheme.primary,



        topBar = {

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(MaterialTheme.colorScheme.primary)
                .padding(3.dp),
                horizontalArrangement = Arrangement.Absolute.Left,
                verticalAlignment = Alignment.CenterVertically



            ){
                Icon(Icons.Default.ArrowBack, contentDescription = "ArrowBack")

                Text(text = "ITPEC")

            }

        },


        content = {
            val compostion by rememberLottieComposition(LottieCompositionSpec.RawRes(com.example.quizproject.R.raw.book))


            Column(modifier = Modifier
                .fillMaxSize()) {



                Column (modifier = Modifier
                    .fillMaxHeight(0.55f)
                    , verticalArrangement = Arrangement.Top){

                    LottieAnimation(composition = compostion, iterations = 1000)

                }







            }


        }


    )


}