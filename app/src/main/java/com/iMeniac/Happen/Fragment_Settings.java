package com.iMeniac.Happen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Settings extends Fragment {

    ListView listView;

    public Fragment_Settings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__settings, container, false);

        listView = view.findViewById(R.id.settingsList);
        ArrayList<String> settingsList = new ArrayList<>();
        settingsList.add("Account");
        settingsList.add("Chats");
        settingsList.add("Notifications");
        settingsList.add("Help");

        ArrayAdapter<String> settingsListAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                settingsList
        );

        listView.setAdapter(settingsListAdapter);

        return view;
    }

}
