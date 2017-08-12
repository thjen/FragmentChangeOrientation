package com.example.qthjen.fragmentchangeorientation;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by qthjen on 8/11/17.
 */

public class FragmentListView extends ListFragment {

    ArrayList<Student> list;
    AdapterStudent adapterStudent;
    PostGetDataStudent postData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        postData = (PostGetDataStudent) getActivity();

        list = new ArrayList<Student>();
        AddStudetn();
        adapterStudent = new AdapterStudent(getActivity(), list, R.layout.row_student);
        setListAdapter(adapterStudent);

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        postData.DataSV(list.get(position));
    }

    private void AddStudetn() {

        list.add(new Student("Bùi Quốc A", 1998, "Phủ Lý", "thjenxxxno1@gmail.com"));
        list.add(new Student("Nguyễn Văn B", 1997, "Hà Nam", "thjenxxxno2@gmail.com"));
        list.add(new Student("Bùi Quốc B", 1996, "Hà Nội", "thjenxxxno3@gmail.com"));
        list.add(new Student("Trân Văn C", 1995, "Châu Sơn", "thjenxxxno4@gmail.com"));
        list.add(new Student("Lữ Thị D", 1994, "Minh Khai", "thjenxxxno5@gmail.com"));
        list.add(new Student("Bùi Quốc Thjen", 1999, "Ngọa Long", "thjenxxxno6@gmail.com"));

    }


}
