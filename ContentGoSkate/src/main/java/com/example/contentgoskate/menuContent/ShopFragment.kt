package com.example.contentgoskate.menuContent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.contentgoskate.R

class ShopFragment : Fragment(){
    companion object {
        fun newInstance(): ShopFragment = ShopFragment()
    }
    override fun onCreateView(inflater : LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  inflater.inflate(R.layout.shop_fragment, container , false)

    }
}