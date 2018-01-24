package akshay.com.lifecycledemo

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class LifecycleAwareLogging : LifecycleObserver {

    private val LOG_TAG = "LifecycleAwareLogging"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun listeningToCreate() {
        Log.d(LOG_TAG, "onCreate()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun listeningToDestroy() {
        Log.d(LOG_TAG, "onDestroy()")
    }
}