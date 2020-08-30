package com.ldg.sampleviewpager

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


/*
* Implement Adapter
*
* */


class SamplePageAdapter
    (  // 1. constructor contains context and data for layout inflater
    private val context: Context, private val list: List<Predator>
)
    : PagerAdapter(
) {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //2. get layout inflater, inflating view item to container,
        val inflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view= inflater.inflate(R.layout.sample_item_layout,container,false)

        val image=view.findViewById<ImageView>(R.id.predatorImage)
        val name=view.findViewById<TextView>(R.id.predatorName)
        image.setImageDrawable(list.get(position).image)
        name.setText(list.get(position).name)

        container.addView(view)


        return view
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        // 4. check if object is view
        return view== any as View
    }

    override fun getCount(): Int {
        //3. return data list size
        return list.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        //5. remove item
        container.removeViewAt(position)
    }



}