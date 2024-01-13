package com.example.onlinelearningapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onlinelearningapp.ui.theme.Purple40
@Composable
fun Home(navController: NavHostController){

    Column(
        modifier = Modifier.padding(5.dp),
        verticalArrangement = Arrangement.Top,
        //horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Welcome Back \n Daniel Onduru",
            style = TextStyle(
                color = Purple40,
                fontSize =40.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W800,
                textAlign = TextAlign.Left
            )
        )
        Spacer(modifier = Modifier.height(50.dp))

        Row() {

            Button(
                onClick = { /*TODO*/
                    navController.navigate("BookClass")
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White
                ),

            ) {
                Text(text = "Book Class")

            }

            Spacer(modifier = Modifier.width(30.dp))

            Button(
                onClick = { /*TODO*/
                    navController.navigate("BookClass")
                },
                shape = RoundedCornerShape(10.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White
                ),


            ) {
                Text(text = "My Courses")

            }

        }


    }




}