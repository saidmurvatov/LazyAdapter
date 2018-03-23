package sigare.com.lazyrecycleradapter




import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


/**
* Created by Said Murvatov on 23.03.2018.
*/

class LazyAdapter(private val model: ArrayList<LazyModel>, private val layout: Int): RecyclerView.Adapter<LazyAdapter.ViewHolder>() {
    val EXCEPTION = "Parent ViewGroup is null, make sure you are passing correct layout."

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(model[position])
    }

    override fun getItemCount(): Int {
        return model.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = parent?.inflate() ?: throw Exception(EXCEPTION)

        return ViewHolder(view)
    }

    class ViewHolder(private var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(model: LazyModel) {
            binding.setVariable(1, model)
        }
    }

    private fun ViewGroup.inflate(): ViewDataBinding {
        val layoutInflater = LayoutInflater.from(context)

        return DataBindingUtil.inflate(layoutInflater, layout, this, false)
    }
}