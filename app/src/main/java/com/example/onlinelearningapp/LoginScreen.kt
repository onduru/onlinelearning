@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.onlinelearningapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onlinelearningapp.ui.theme.Purple40





@Composable
fun LoginScreen(navController: NavHostController) {
    val checkedState = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Learning App",
            style = TextStyle(
                color = Purple40,
                fontSize =40.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W800,
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(

            text = "Enter Your Login Details To Access your Account",

            style = TextStyle(
                color = Purple40,
                fontSize =25.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.W800,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically

        ){

            Button(onClick = { /*TODO*/
                navController.navigate("") },
                shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                contentColor = Color.White),
            modifier = Modifier.width(width = 150.dp)
                .height(height = 50.dp)


            ) {
                Text(text = "FaceBook ")

            }

            Spacer(modifier = Modifier.width(30.dp))

            Button(onClick = { /*TODO*/
                navController.navigate("") },
                shape = RoundedCornerShape(10.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White),
                modifier = Modifier.width(width = 150.dp)
                    .height(height = 50.dp)

                ) {
                Text(text = "Google")

            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var text by remember { mutableStateOf(TextFieldValue("")) }


            Spacer(modifier = Modifier.height(30.dp))

            EmailTextField()
            PasswordTextField()
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Checkbox(
                    checked = checkedState.value,
                    modifier = Modifier.padding(0.dp),
                    onCheckedChange = { checkedState.value = it },
                )
                Text(text = "Remember me ?", modifier = Modifier.padding(0.dp))
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = "Forget Password?")
            }


            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { /*TODO*/
                navController.navigate("StartScreen") },
                shape = RoundedCornerShape(10.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40,
                    contentColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 50.dp)

            ) {
                Text(text = "Login With Your Account")
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.padding(20.dp)
            ){
                Text(text = "Don't Have an Account?", modifier = Modifier.padding(1.dp))
                Text(text = "Create Account")
            }

        }

    }
}



@Composable
fun EmailTextField() {
    var email by remember { mutableStateOf("") }

    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = { Text("Email") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = androidx.compose.ui.text.input.ImeAction.Next
        ),
        modifier = Modifier
            .padding(bottom = 16.dp)
    )
}

@Composable
fun PasswordTextField() {
    var password by remember { mutableStateOf("") }

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Password") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = null
            )
        },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = androidx.compose.ui.text.input.ImeAction.Done
        ),
        modifier = Modifier.padding(5.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun EmailPasswordFieldsPreview() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            EmailTextField()
            PasswordTextField()
        }

}


