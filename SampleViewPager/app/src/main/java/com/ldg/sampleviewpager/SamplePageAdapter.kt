package com.ldg.sampleviewpager

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup


/*
* TODO: Implement Adapter
*
* */


class SamplePageAdapter()
    : PagerAdapter() {
    //TODO 1. constructor contains context and data for layout inflater
    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        //TODO 2. get layout inflater, inflating view item to container,
        return super.instantiateItem(container, position)
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        //TODO 4. check if object is view
        return false
    }

    override fun getCount(): Int {
        //TODO 3. return data list size
        return 0
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        //TODO 5. remove item
    }


}