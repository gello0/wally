/*
 * Copyright (C) 2014 Freddie (Musenkishi) Lust-Hed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.musenkishi.wally.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.musenkishi.wally.fragments.LatestFragment;
import com.musenkishi.wally.fragments.RandomImagesFragment;
import com.musenkishi.wally.fragments.SavedImagesFragment;
import com.musenkishi.wally.fragments.SearchFragment;
import com.musenkishi.wally.fragments.ToplistFragment;

/**
 * Created by Musenkishi on 2014-05-26 17:26.
 */
public class SmartFragmentPagerAdapter extends SmartFragmentStatePagerAdapter {
    private static final int TOP_LIST_FRAGMENT = 0;
    private static final int SAVED_IMAGES_FRAGMENT = 1;
    private static final int SEARCH_FRAGMENT = 2;
    private static final int RANDOM_IMAGES_FRAGMENT = 3;
    private static final int LATEST_FRAGMENT = 4;
    private static final int NUM_ITEMS = 5;

    public SmartFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TOP_LIST_FRAGMENT:
                return ToplistFragment.newInstance();
            case SAVED_IMAGES_FRAGMENT:
                return SavedImagesFragment.newInstance();
            case SEARCH_FRAGMENT:
                return SearchFragment.newInstance();
            case RANDOM_IMAGES_FRAGMENT:
                return RandomImagesFragment.newInstance();
            case LATEST_FRAGMENT:
                return LatestFragment.newInstance();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}
