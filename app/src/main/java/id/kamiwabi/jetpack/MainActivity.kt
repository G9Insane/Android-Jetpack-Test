package id.kamiwabi.jetpack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.view.MenuItem
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val navigationView: NavigationView = findViewById(R.id.navigation)
        when (item.itemId) {
            R.id.navigation_home -> navigationView.let { Navigation.findNavController(it).navigate(R.id.end_action) }
            R.id.navigation_dashboard -> navigationView.let { Navigation.findNavController(it).navigate(R.id.home_action) }
            R.id.navigation_notifications -> navigationView.let { Navigation.findNavController(it).navigate(R.id.home_action) }
        }
        return true
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        

    }


}
