import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup

class {adapterName}: RecyclerView.Adapter<{adapterName}.ViewHolder>() {

    private val listName = mutableListOf<{dataType}>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitAndNotify(list: List<{dataType}>) {
        listName.clear()
        listName.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: {childItemBindingClassName}): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): {adapterName}.ViewHolder {
        val binding = {childItemBindingClassName}.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: {adapterName}.ViewHolder, position: Int) {
        val data = listName[position]
        with(holder.binding) {

        }
    }

    override fun getItemCount(): Int = listName.size

}