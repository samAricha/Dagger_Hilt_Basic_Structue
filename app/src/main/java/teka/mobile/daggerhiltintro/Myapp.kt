package teka.mobile.daggerhiltintro

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//this class is used to provide context to our dagger-hilt
@HiltAndroidApp
class Myapp: Application() {
}