package com.iMeniac.Happen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;


public class Fragment_Home extends Fragment {

    Toolbar toolbar;

    public Fragment_Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment__home, container, false);

        toolbar = v.findViewById(R.id.toolbarHome);
        //AppCompatActivity activity = (AppCompatActivity) getActivity();//This is a fragment so we need appcompact
        //activity.setSupportActionBar(toolbar);
        //toolbar.setTitle("Happen");
        toolbar.inflateMenu(R.menu.menu_home_toolbar);
        //activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Back Button
        return v;
    }

   /* @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_home_toolbar,menu);
        MenuItem searchItem = menu.findItem(R.id.menu_toolbar_searchIcon);
        SearchView searchView = (SearchView) searchItem.getActionView();

    }*/
}






















