package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //updating Action Bar title dynamically
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            // Update activity title with current Fragment description
            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    setTitle(R.string.category_sights);
                } else if (position == 1) {
                    setTitle(R.string.category_attractions);
                } else if (position == 2) {
                    setTitle(R.string.category_welcome);
                } else if (position == 3) {
                    setTitle(R.string.category_hotels);
                } else {
                    setTitle(R.string.category_restaurants);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //set current view pager page to middle one
        viewPager.setCurrentItem(2);

        // Find the tab layout that shows the tabs
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Distribute the Tabs evenly to all the of the width of your screen
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

        // displaying icons in tabs as their titles
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            if (i == 0) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_sights);
            } else if (i == 1) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_attracion);
            } else if (i == 2) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_home_active);
            } else if (i == 3) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_hotel);
            } else {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_restaurant);
            }
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // updating active icon image with active state image when tab gains focus
                int position = tab.getPosition();
                if (position == 0) {
                    tab.setIcon(R.drawable.ic_sights_active);
                } else if (position == 1) {
                    tab.setIcon(R.drawable.ic_attraction_active);
                } else if (position == 2) {
                    tab.setIcon(R.drawable.ic_home_active);
                } else if (position == 3) {
                    tab.setIcon(R.drawable.ic_hotel_active);
                } else {
                    tab.setIcon(R.drawable.ic_restaurant_active);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // when tab loses focus icon image is being changed to inactive state image
                int position = tab.getPosition();
                if (position == 0) {
                    tab.setIcon(R.drawable.ic_sights);
                } else if (position == 1) {
                    tab.setIcon(R.drawable.ic_attracion);
                } else if (position == 2) {
                    tab.setIcon(R.drawable.ic_home);
                } else if (position == 3) {
                    tab.setIcon(R.drawable.ic_hotel);
                } else {
                    tab.setIcon(R.drawable.ic_restaurant);
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
