package com.brandlee.kotlindemo

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * @ClassName: ForecastListAdapter
 * @Description:
 * @Author liqi1
 * @Date 17/6/6
 */
class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
