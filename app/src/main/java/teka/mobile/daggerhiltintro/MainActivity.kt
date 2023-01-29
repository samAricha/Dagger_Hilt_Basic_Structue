package teka.mobile.daggerhiltintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import teka.mobile.daggerhiltintro.presentation.MyViewModel
import teka.mobile.daggerhiltintro.ui.theme.DaggerHiltIntroTheme

@AndroidEntryPoint//needed bcs of injecting dependency in android component class e.g activity, fragment, class etc
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltIntroTheme {
                val viewModel = hiltViewModel<MyViewModel>()

            }
        }
    }
}


