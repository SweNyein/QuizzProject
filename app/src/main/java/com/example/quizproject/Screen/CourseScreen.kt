package com.example.quizproject.Screen

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CourseScreen() {




    Scaffold(
        containerColor = MaterialTheme.colorScheme.primary,

        topBar = {
            /*TopAppBar(title = {
                Row {



                }
            },Modifier.background(MaterialTheme.colorScheme.primary)
                )*/

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




            Column (modifier = Modifier.fillMaxHeight(1f),
                verticalArrangement = Arrangement.Bottom
                ){


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.55f)
                        .background(
                            MaterialTheme.colorScheme.secondary,
                            RoundedCornerShape(topStart = 30.dp)
                        )
                ) {

                    Column(
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState()),
                        ) {




                        Text(text = "ITPEC")






                        /*

                                                Card(
                                                    modifier = Modifier
                                                        .fillMaxWidth(0.87f)
                                                        .height(50.dp)
                                                      .padding(top = 10.dp),
                                                    elevation = CardDefaults.cardElevation(2.dp),
                                                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),


                                                ){


                                                }


                                                Card(
                                                    modifier = Modifier
                                                        .fillMaxWidth(0.87f)
                                                        .height(50.dp)
                                                        .padding(top = 10.dp),
                                                    elevation = CardDefaults.cardElevation(2.dp),

                                                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),


                                                    ){


                                                }


                                                Card(
                                                    modifier = Modifier
                                                        .fillMaxWidth(0.87f)
                                                        .height(50.dp)
                                                        .padding(top = 10.dp),
                                                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
                                                    elevation = CardDefaults.cardElevation(2.dp),



                                                    ){


                                                }

                                                Spacer(modifier = Modifier.height(50.dp))

                        */



                    }








                }




            }





        }




    )



}