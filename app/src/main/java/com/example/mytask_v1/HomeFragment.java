package com.example.mytask_v1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.versionedparcelable.VersionedParcel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    //init
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;
    private ArrayList<Task> ListTask;

    private static String KEY_MATKUL = "msg_matkul";
    private static String KEY_TUGAS = "msg_tugas";
    private static String KEY_DESKRIPSI = "msg_deskripsi";


    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //initData manual
        try {
            initData();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            ListTask.add(new Task(getArguments().getString(KEY_MATKUL),getArguments().getString(KEY_TUGAS),getArguments().getString(KEY_DESKRIPSI)));
        }catch (Exception ex){
            ex.printStackTrace();
        }



        //baru masukin recyclernya
        recyclerView = view.findViewById(R.id.HomeRecycler);
        taskAdapter = new TaskAdapter(ListTask);

        //Masih 1 nampilnya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(taskAdapter);

        return view;

    }

    public void initData() throws ParseException {

        ListTask = new ArrayList<>();

        ListTask.add(new Task("Statistika & Probabilitas", "Statistika distributif", "Cari jurnal"));
        ListTask.add(new Task("PKN", "Tantangan ideologi", "Buat artikel ilmiah"));

    }
}