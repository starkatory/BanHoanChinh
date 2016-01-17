package com.package_for_video;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;
import com.package_for_story.Story_Entity;

import java.util.ArrayList;

/**
 * Created by Administrator on 15/01/2016.
 */
public class ListVideoActivity extends AppCompatActivity {
    VideoAdapter videoAdapter;
    ArrayList<Video_Entity> arrayList;
    ListView listVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_video);

        getData();
        videoAdapter = new VideoAdapter(ListVideoActivity.this, R.layout.video_item, arrayList);
        listVideo = (ListView) findViewById(R.id.list_video);
        listVideo.setAdapter(videoAdapter);
/*Thu xem su kien chon item play video co duoc ko*/
        listVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(),VideoPlayer.class);
                startActivity(intent);
            }
        });
    }

    private void getData() {
        arrayList = new ArrayList<Video_Entity>();
        arrayList.add(new Video_Entity(1, "Thỏ và Rùa", "Unknow", R.drawable.songoku1));
        arrayList.add(new Video_Entity(1, "Long tranh hổ đấu", "Lý Tiểu Long", R.drawable.songoku1));
    }


}
