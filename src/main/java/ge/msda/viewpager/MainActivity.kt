package ge.msda.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ge.msda.viewpager.adapter.ViewPagerFragmentAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager)

        viewPager2.adapter = ViewPagerFragmentAdapter(this)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

    }

}