package com.package_for_video;

import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 16/01/2016.
 */
public class VideoPlayer extends ListVideoActivity {
    VideoAdapter videoAdapter;
    ListView listView;
    ArrayList<Video_Entity> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_video);

    }
}
