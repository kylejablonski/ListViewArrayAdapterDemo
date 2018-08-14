package com.kdotj.demo.listsinandroid

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class ContactArrayAdapter(
        private val contacts: List<ContactObject>,
        context: Context,
        resourceId: Int
) : ArrayAdapter<ContactObject>(context, resourceId) {

    class ViewHolder {
        lateinit var textViewFullName: AppCompatTextView
        lateinit var textViewAddress: AppCompatTextView
        lateinit var textViewPhoneNumber: AppCompatTextView
    }

    override fun getCount(): Int {
        return contacts.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder: ViewHolder
        val view: View

        if (convertView == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.contact_row, parent, false)
            viewHolder = ViewHolder()
            viewHolder.textViewFullName = view.findViewById(R.id.textViewFullName)
            viewHolder.textViewAddress = view.findViewById(R.id.textViewAddress)
            viewHolder.textViewPhoneNumber = view.findViewById(R.id.textViewPhone)
            view.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
            view = convertView
        }
        val contact = contacts[position]

        viewHolder.textViewFullName.text = String.format("%s %s", contact.firstName, contact.lastName)
        viewHolder.textViewAddress.text = contact.address
        viewHolder.textViewPhoneNumber.text = contact.phone
        return view
    }
}