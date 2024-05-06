 #IMAD ASSIGNMENT 2

## ST10457924-Njabulo Shongwe

### 06/05/2024

#### ADIE JANSEN VAN RENSBURG

3\. GitHub

<https://github.com/st10457924/MyTamagotchiApp2/tree/master/MyTamagotchiApp2/app/src/main>

4\. YouTube Link

<https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2F9lqw0trtcPY%3Fsi%3DmXpY3FxGoyDXmNwF&data=05%7C02%7Cst10457924%40vcconnect.edu.za%7Cdd755b107c1247c7836908dc6e1282f2%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638506273019984991%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=GBQNC4DPKWo7M2pWpKCHodpjR%2Bn5RNJaVfRMuhCM6xc%3D&reserved=0>

5\. Code

MainActivity: lass MainActivity : AppCompatActivity() {  
  
override fun onCreate(savedInstanceState: Bundle?) {  
super.onCreate(savedInstanceState)  
setContentView(R.layout.*activity\_main*)  
val startButton = findViewById&lt;Button>(R.id.*startButton*)  
startButton.setOnClickListener **{**  
//to move to the next page  
val intent = Intent( this, TamagotchiMainActivity2 ::class.*java*)  
startActivity(intent)  
**}**  
}  
}

import android.annotation.SuppressLint  
import android.content.Intent  
import androidx.appcompat.app.AppCompatActivity  
import android.os.Bundle  
import android.widget.Button  
import android.widget.ImageView  
import android.widget.ProgressBar  
import android.widget.TextView  
  
  
class TamagotchiMainActivity2 : AppCompatActivity() {
@SuppressLint("MissingInflatedId")  
override fun onCreate(savedInstanceState: Bundle?) {  
super.onCreate(savedInstanceState)  
setContentView(R.layout.*activity\_tamagotchi\_main2*)  
  
val petImageView = findViewById&lt;ImageView>(R.id.*petImageView*)  
  
val feedButton = findViewById&lt;Button>(R.id.*feedButton*)  
  
val cleanButton = findViewById&lt;Button>(R.id.*cleanButton*)  
  
val playButton = findViewById&lt;Button>(R.id.*playButton*)  
  
val petplayTextView =
findViewById&lt;TextView>(R.id.*petplayTextView*)  
  
feedButton.setOnClickListener **{**  
petImageView.setImageResource(R.drawable.*dogeating*)  
  
petplayTextView.*text* = "I appreciate you for feeding me"  
**}**  
cleanButton.setOnClickListener **{**  
petImageView.setImageResource(R.drawable.*dogwash*)  
  
petplayTextView.*text* = "Thank you for making me clean"  
**}**  
playButton.setOnClickListener **{**  
petImageView.setImageResource(R.drawable.*dogplaying*)  
  
petplayTextView.*text* = "Thank you, I had a great time playing with
you"  
  
**}**  
}  
}

6\. Reference

Android Developers.2024. Create your first Android App, 12 April 2024.
\[Online\]. Available at:
<https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fwww.instructables.com%2FHow-To-Create-An-Android-App-With-Android-Studio%2F%3Famp_page%3Dtrue&data=05%7C02%7Cst10457924%40vcconnect.edu.za%7Cfd5a762feb8e4bc9595c08dc6e13c548%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638506278424642814%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=rnLlQJi8RkXLtfPUD2rKBdDNnmhOJtJpAjWcpGa2Pmw%3D&reserved=0>

\[Assessed 06 May 2024\]
