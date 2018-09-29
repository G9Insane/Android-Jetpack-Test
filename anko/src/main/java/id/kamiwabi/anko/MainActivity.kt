package id.kamiwabi.anko

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout { //Start a Layout (verticalLayout,linearLayout,relativeLayout...)
            linearLayout { //Inside one, you can start another one
                //Content of layout, like buttons and other things
                button("Some text"){
                    onClick { toast("Hi there!") }
                }
            }
        }
        toast("Hi there!")
        toast(R.string.message)
        longToast("Wow, such duration")
        alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
            yesButton { toast("Oh…") }
            noButton {}
        }.show()

    }
}

