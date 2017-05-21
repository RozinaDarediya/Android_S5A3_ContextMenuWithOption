package com.example.dell.s5a3_contextmenuwithoption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.View;
import android.view.ContextMenu;
import android.view.MenuInflater;
import java.util.ArrayList;


/**
 *      Implemented context menu having two options: call and SMS.
 *      For this, I have taken a custom list having two text views in a row.
 *      One text view for name and another one for phone number.
 *      Written implicit intent action for call and SMS.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String Phone;
    ListView lv;
    String name1, name2, name3, name4, name5, name6, name7,
            phone1, phone2, phone3, phone4, phone5, phone6, phone7;

    ArrayList<Student> mArrayList;
    StudentAdapter mStudentAdapter;

    //created listView using arraylist
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);

        mArrayList = new ArrayList<>();

        mArrayList.add(new Student("Lisa", "9767567987"));
        mArrayList.add(new Student("Nisha", "9898987987"));
        mArrayList.add(new Student("Tina", "9778989988"));
        mArrayList.add(new Student("Misha", "7865987987"));
        mArrayList.add(new Student("Trisha", "9778432187"));
        mArrayList.add(new Student("Mina", "9456987987"));
        mArrayList.add(new Student("Krina", "9778986532"));

        //taken student adapter and set it to list
        mStudentAdapter = new StudentAdapter(this, mArrayList);
        lv.setAdapter((ListAdapter) mStudentAdapter);
        lv.setOnItemClickListener(this);

        //register the context menu with listview
        registerForContextMenu(lv);
    }

    //inflate the menu that is call and sms
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
