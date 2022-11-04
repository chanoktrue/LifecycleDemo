package com.chanoktrue.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.chanoktrue.lifecycledemo.ui.theme.LifecycleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    ComposableLifecycle { source, event ->
        when(event) {
            Lifecycle.Event.ON_CREATE -> { Log.d("LifeCycle", "MainScreen: onCreate")}
            Lifecycle.Event.ON_START -> { Log.d("TLifeCycleAG", "MainScreen: onStart")}
            Lifecycle.Event.ON_RESUME -> { Log.d("LifeCycle", "MainScreen: onResume")}
            Lifecycle.Event.ON_PAUSE -> { Log.d("LifeCycle", "MainScreen: onPause")}
            Lifecycle.Event.ON_STOP -> { Log.d("LifeCycle", "MainScreen: onStop")}
            Lifecycle.Event.ON_DESTROY -> {Log.d("LifeCycle", "MainScreen: onDestroy")}
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LifecycleDemoTheme {
        MainScreen()
    }
}