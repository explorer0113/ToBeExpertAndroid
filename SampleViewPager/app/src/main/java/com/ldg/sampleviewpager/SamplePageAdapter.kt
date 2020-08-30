package com.ldg.sampleviewpager

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup


/*
* TODO: Implement Adapter
*
* */


class SamplePageAdapter : PagerAdapter() {
    //TODO 1. constructor contains context and data for layout inflater
    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        //TODO 2.
        return false
    }

    override fun getCount(): Int {
        //TODO 3. return data list size
        return 0
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        //TODO 4. remove item
    }


}