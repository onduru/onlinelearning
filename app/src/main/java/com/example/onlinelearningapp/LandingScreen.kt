package com.example.onlinelearningapp

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onlinelearningapp.ui.theme.Purple40



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingScreen(navController: NavHostController) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(

            painter = painterResource(id = R.drawable.landingpage),
            contentDescription = "Landing Page Image"
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Online Learning Platform",
            style = TextStyle(
                color = Purple40,
                fontSize =30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W800,
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(

            text = "These platforms use technology to provide flexible," +
                    " accessible education, encompassing academic subjects" +
                    " to practical skills. Popular for their convenience, affordability," +
                    " and global accessibility, online learning platforms contribute to " +
                    "democratizing education.",

            style = TextStyle(
                color = Color.Black,
                fontSize =15.sp,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/
        navController.navigate("LoginScreen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple40,
                contentColor = Color.White),
            modifier = Modifier.width(width = 250.dp)

        ) {
            Text(text = "Start Learning")

            
        }

    }

}