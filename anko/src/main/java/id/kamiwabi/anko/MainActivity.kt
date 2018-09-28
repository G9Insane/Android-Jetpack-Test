package id.kamiwabi.anko

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("Hi there!")
        toast(R.string.message)
        longToast("Wow, such duration")
        alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
            yesButton { toast("Oh…") }
            noButton {}
        }.show()

    }
}

