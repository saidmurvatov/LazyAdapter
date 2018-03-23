package sigare.com.lazyadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import sigare.com.lazyadapter.Models.TwoLazyStrings
import sigare.com.lazyrecycleradapter.*

class MainActivity : AppCompatActivity() {

    private val lazyTwoStrings: ArrayList<LazyModel> = ArrayList()
    private val lazyAdapter = LazyAdapter(lazyTwoStrings, R.layout.lazy_recycler_item_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.VERTICAL




        lazyRecyclerView.layoutManager = llm
        lazyRecyclerView.adapter = lazyAdapter

        addNext.setOnClickListener { lazyTwoStrings.add(TwoLazyStrings("${lazyAdapter.itemCount}", "this is ${lazyAdapter.itemCount} item")); lazyAdapter.notifyDataSetChanged() }
    }
}
