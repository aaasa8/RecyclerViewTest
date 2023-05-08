package ddwu.com.mobile.recyclerviewtest

import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdeter(val contextval:  layout: Int, val dataList) : RecyclerView.Adapter<MyAdeter.MyViewHolder>(){


    val TAG = "MyAdeter"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.d(TAG, "create ViewHolder")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvText.setText(dataList)[position]
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvText = view.findViewById(R.id.tvText)
    }

}