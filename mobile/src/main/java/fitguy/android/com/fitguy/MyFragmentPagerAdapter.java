package fitguy.android.com.fitguy;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Stats", "Activities", "Missions"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StatsFragment();
        } else if (position == 1) {
            return new ActivitiesFragment();
        } else if (position == 2) {
            return new MissionsFragment();
        }

        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
