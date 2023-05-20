package com.mesum.businnescardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mesum.businnescardcompose.ui.theme.BusinnesCardComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            val colorCode = 0xFF shl 24 or (210 shl 16) or (232 shl 8) or 211


            BusinnesCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(colorCode)
                ) {
                    val systemUiController = rememberSystemUiController()

                    DisposableEffect(systemUiController) {
                        // Update the status bar color to be transparent.
                        systemUiController.setSystemBarsColor(color = Color(colorCode))

                        // Dispose of the effect when the composable is removed from the composition.
                        onDispose {
                        }
                    }

                        //Personal information mac financial IT
                        //Peronal  information mac in Effecial information
                        BusinessCardNameTitleIcon()
                    PersonalInfoVertical()



                }
            }
        }
    }
}


@Composable
fun BusinessCardNameTitleIcon(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.baseline_android_24)

    Box(
        modifier = modifier
            .padding(top = 50.dp)
            .wrapContentSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(modifier = modifier, color = Color.DarkGray, elevation = 5.dp) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = image, contentDescription = null, modifier = modifier.width(100.dp).height(50.dp))
                    Text(
                        text = "Android",
                        color = Color.White,
                        fontStyle = FontStyle.Normal,
                        fontSize = 12.sp,
                        modifier = modifier.padding(4.dp)
                    )
                }
            }

            Text(text = "Jennifer Doe", fontSize = 36.sp)
            Text(text = "Android Development Ectraordinaire", color =  Color(0xFF3ddc84), fontSize = 18.sp)
        }
    }
}

@Composable
fun PersonalInfoVertical(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(modifier = modifier.padding(16.dp)) {
            // Add your column layout components here
            val phone = painterResource(id = R.drawable.baseline_phone_android_24)
            val share = painterResource(id = R.drawable.baseline_share_24)
            val email = painterResource(id = R.drawable.baseline_email_24)

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = modifier.padding(8.dp)
            ) {



                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                    tint = Color.DarkGray,
                    modifier = modifier.padding(8.dp)
                )
                Text(text = "+971-50-500-8000", modifier = modifier.padding(4.dp))
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = modifier.padding(8.dp)
            ) {


                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = null,
                    tint = Color.DarkGray,
                    modifier = modifier.padding(8.dp)
                )
                Text(text = "@AndroidDev", modifier = modifier.padding(4.dp))
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = modifier.padding(8.dp)
            ) {


                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    tint = Color.DarkGray,
                    modifier = modifier.padding(8.dp)
                )
                Text(text = "+jef-stuart@android.com", modifier = modifier.padding(4.dp))
            }
        }
    }
}



@Preview(showBackground = false)
@Composable
fun BusinessCardPreview() {
    BusinnesCardComposeTheme {

        Column(modifier = Modifier.padding(36.dp), verticalArrangement = Arrangement.Center, horizontalAlignment =CenterHorizontally) {

            BusinessCardNameTitleIcon()
            PersonalInfoVertical()

        }

    }
}