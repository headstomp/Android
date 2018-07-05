package com.example.android.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BotSectionFragment extends Fragment {

    private static TextView textViewTop;
    private static TextView textViewBot;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bot_section_fragment, container, false);
        textViewTop = (TextView) view.findViewById(R.id.textViewTop);
        textViewBot = (TextView) view.findViewById(R.id.textViewBot);
        return view;
    }

    public void setMemeText(String top, String bottom){
        textViewTop.setText(top);
        textViewBot.setText(bottom);
    }
}
