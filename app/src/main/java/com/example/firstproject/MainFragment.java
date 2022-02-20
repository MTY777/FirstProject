package com.example.firstproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private ArrayList<String> persons;
    private RecyclerView recyclerView;
    private PersonAdapter personAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle);
        personAdapter =new PersonAdapter(persons);
        recyclerView.setAdapter(personAdapter);
    }

    private void loadData() {
        persons = new ArrayList<>();
        persons.add("+996 707 519 011");
        persons.add("+996 706 529 012");
        persons.add("+996 705 539 013");
        persons.add("+996 704 549 014");
        persons.add("+996 703 559 015");
        persons.add("+996 702 569 016");
        persons.add("+996 701 579 017");
        persons.add("+996 708 589 018");
        persons.add("+996 709 599 019");
        persons.add("+996 710 510 021");
        persons.add("+996 711 511 022");
        persons.add("+996 712 512 020");

    }
}