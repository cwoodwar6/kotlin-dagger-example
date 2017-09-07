package org.loop.example

//import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import javax.inject.Inject
import javax.inject.Named

class MainActivity : Activity() {

    val TAG = MainActivity::class.java.name

    @Inject
    lateinit var locationManager: LocationManager

    @field:[Inject Named("something")]
    lateinit var something: String

    @field:[Inject Named("somethingElse")]
    lateinit var somethingElse: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication.graph.inject(this)
//        assert(textView != null)
        Log.d(TAG, "$something and $somethingElse")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return super.onOptionsItemSelected(item)
    }

}
