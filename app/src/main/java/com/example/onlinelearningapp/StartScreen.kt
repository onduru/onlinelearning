package com.example.onlinelearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onlinelearningapp.ui.theme.Purple40

@Composable
fun StartScreen(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = "Learning App",
            style = TextStyle(
                color = Purple40,
                fontSize =30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W800,
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Image(

            painter = painterResource(id = R.drawable.rightimage),
            contentDescription = "Landing Page Image"
        )

        Spacer(modifier = Modifier.height(8.dp))
        
        Text(text = "Select Your Coourse Level")

        Row (
            modifier = Modifier
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically

        ){

            Button(onClick = { /*TODO*/
                navController.navigate("") },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White),
            ) {
                Text(text = "Beginner")

            }

            Spacer(modifier = Modifier.width(2.dp))

            Button(onClick = { /*TODO*/
                navController.navigate("") },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White),
            ) {
                Text(text = "Intermidate")

            }

            Spacer(modifier = Modifier.width(2.dp))

            Button(onClick = { /*TODO*/
                navController.navigate("") },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White),
            ) {
                Text(text = "Expert")

            }

            Spacer(modifier = Modifier.width(2.dp))



        }



    }
}