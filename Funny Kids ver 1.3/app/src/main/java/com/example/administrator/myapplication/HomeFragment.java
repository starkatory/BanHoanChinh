package com.example.administrator.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.package_for_music.ListMusicActivity;
import com.package_for_story.ListStoryActivity;
import com.package_for_learning.Learnning_Activity;
import com.package_for_video.ListVideoActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private ImageView imgMusic, imgVideo, imgStory, imgLearning;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        imgMusic = (ImageView) view.findViewById(R.id.imgListMusic);
        imgMusic.setOnClickListener(OnClick_AmNhac);
        imgStory = (ImageView) view.findViewById(R.id.imgListStory);
        imgStory.setOnClickListener(OnClick_Truyen);
        imgLearning = (ImageView) view.findViewById(R.id.imgLeaning);
        imgLearning.setOnClickListener(OnClick_Learning);
        imgVideo = (ImageView)view.findViewById(R.id.imgListMovie);
        imgVideo.setOnClickListener(OnClick_Video);
        return view;
    }

    View.OnClickListener OnClick_AmNhac = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent next = new Intent(getActivity(), ListMusicActivity.class);
            startActivity(next);
        }
    };
    View.OnClickListener OnClick_Truyen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent next = new Intent(getActivity(), ListStoryActivity.class);
            startActivity(next);
        }
    };
    View.OnClickListener OnClick_Learning = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent next = new Intent(getActivity(), Learnning_Activity.class);
            startActivity(next);
        }
    };

    View.OnClickListener OnClick_Video = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent next = new Intent(getActivity(), ListVideoActivity.class);
            startActivity(next);
        }
    };


}