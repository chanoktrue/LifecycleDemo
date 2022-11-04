# LifecycleDemo

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
