package juniojsv.minimum

import android.content.Context
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.app_view.view.*

class Adapter internal constructor(private val context: Context, private val appsList: MutableList<App>) : BaseAdapter() {

    override fun getCount(): Int {
        return appsList.size
    }

    override fun getItem(position: Int): App {
        return appsList[position]
    }

    override fun getItemId(position: Int): Long {
        return appsList.indexOf(appsList[position]).toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val targetView: View = inflate(context, R.layout.app_view, null)

        targetView.icon_view.setImageDrawable(appsList[position].icon)
        targetView.name_view.text = appsList[position].packageLabel
        return targetView
    }
}
