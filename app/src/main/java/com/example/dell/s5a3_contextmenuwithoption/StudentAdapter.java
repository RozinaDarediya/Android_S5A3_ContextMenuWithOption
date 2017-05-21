package com.example.dell.s5a3_contextmenuwithoption;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by dell on 3/17/2017.
 * Student adapter and its methods
 * getCount() -> will return the size of array
 * getItem()-> will return the position
 * getView() -> will set the name and phone number in the list
 */
public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> mArrayList;
    LayoutInflater mLayoutInflater;

    public StudentAdapter(Context context, ArrayList<Student> mArrayList) {
        this.mArrayList  = mArrayList;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mLayoutInflater.inflate(R.layout.customlistview, parent, false);
        Student student = (Student) getItem(position);
        TextView name=(TextView)convertView.findViewById(R.id.name);
        TextView phone=(TextView)convertView.findViewById(R.id.phone);
        name.setText((CharSequence) student.getName());
        phone.setText(student.getPhone());
        return convertView;
    }
}
