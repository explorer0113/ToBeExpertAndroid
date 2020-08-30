package com.ldg.sampleviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager

/*
* adapt adaptor to view pager
* */
class MainActivity : AppCompatActivity() {
    private val viewPager:ViewPager by lazy {
        findViewById(R.id.viewPager) as ViewPager
    }

    private val samplePageAdapter:SamplePageAdapter by lazy {
        val sampleData= arrayListOf<Predator>()
        sampleData.add(Predator(getDrawable(R.drawable.puppy),"Wolf"))
        sampleData.add(Predator(getDrawable(R.drawable.cat),"Tiger"))
        SamplePageAdapter(context = this,list=sampleData)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1. viewpager binding, create adaptor, set adaptor to viewpager

        viewPager.adapter=samplePageAdapter
    }
}