package com.tanapakorlaop.fragmentcontrol;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class FirstFragment extends MyFragment {
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        imageView = (ImageView)rootView.findViewById(R.id.picture);
        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);

        return rootView;
    }
}
