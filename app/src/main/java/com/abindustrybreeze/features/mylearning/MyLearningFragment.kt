package com.abindustrybreeze.features.mylearning
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.abindustrybreeze.R
import com.abindustrybreeze.base.presentation.BaseFragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation


class MyLearningFragment : BaseFragment() {
    private lateinit var mContext:Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_my_learning, container, false)

        return view
    }


    companion object {
        fun getInstance(objects: Any): MyLearningFragment {
            val fragment = MyLearningFragment()
            return fragment
        }
    }

}