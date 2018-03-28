package sample.com.jobin.msi.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sample.com.jobin.msi.myapplication.IconTablayout.AbstractIconTabLayoutViewPagerAdapter;
import sample.com.jobin.msi.myapplication.IconTablayout.IconTabLayout;
import sample.com.jobin.msi.myapplication.IconTablayout.IconTabLayoutViewPager;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        IconTabLayout tabLayout = (IconTabLayout) findViewById(R.id.tabLayout);
        IconTabLayoutViewPager viewPager = (IconTabLayoutViewPager) findViewById(R.id.viewPager);
        DemoPagerAdapter adapter = new DemoPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    public static class DemoPagerAdapter extends AbstractIconTabLayoutViewPagerAdapter {

        public DemoPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new HomeFragment();
                case 1:
                    return new NotificationFragment();
                case 2:
                    return new CameraFragment();
                case 3:
                    return new FavouriteFragment();
                case 4:
                    return new ProfileFragment();
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return super.getPageTitle(position);
            //        switch (position) {
            //            case 0:
            //                return "Money";
            //            case 1:
            //                return "People";
            //            case 2:
            //                return "Message";
            //            case 3:
            //                return "Me";
            //            default:
            //                return null;
            //        }
        }

        @Override
        public int getPageIconResId(int position) {
            switch (position) {
                case 0:
                    return R.drawable.ic_home;
                case 1:
                    return R.drawable.ic_notification;
                case 2:
                    return R.drawable.camera;
                case 3:
                    return R.drawable.ic_favourite;
                case 4:
                    return R.drawable.ic_profile;

                default:
                    return 0;
            }
        }

        @Override
        public int getPageSelectedIconResId(int position) {
            switch (position) {
                case 0:
                    return R.drawable.ic_home_select;
                case 1:
                    return R.drawable.ic_notification_select;
                case 2:
                    return R.drawable.camera;

                case 3:
                    return R.drawable.ic_star_select;
                case 4:
                    return R.drawable.ic_profile_select;
                default:
                    return 0;
            }
        }
    }
}
