package com.package_for_story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 14/01/2016.
 */
public class ListStoryActivity extends AppCompatActivity {
    StoryAdapter storyAdapter;
    ArrayList<Story_Entity> arrayList;
    ListView listStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_story);

        getData();
        storyAdapter = new StoryAdapter(ListStoryActivity.this, R.layout.story_item, arrayList);
        listStory = (ListView) findViewById(R.id.list_story);
        listStory.setAdapter(storyAdapter);

         /*Thu xem click vao item co ra giao dien play truyen ko*/
        listStory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 Intent intent = new Intent(view.getContext(), StoryPlayer.class);
                                                 startActivity(intent);
                                             }
                                         }
        );
    }

    private void getData(){
        arrayList = new ArrayList<Story_Entity>();
        arrayList.add(new Story_Entity(1, "Thạch Sanh", "Unknow", R.drawable.story_icon_item));
        arrayList.add(new Story_Entity(1, "Tấm Cám", "Unknow", R.drawable.story_icon_item));

    }


}
