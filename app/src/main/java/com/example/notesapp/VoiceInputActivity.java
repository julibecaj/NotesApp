package com.example.notesapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class VoiceInputActivity extends Fragment {

    public VoiceInputActivity(){

    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
            return inflater.inflate(R.layout.voice_input_activity, container, false);
    }
}



