package com.package_for_music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.myapplication.R;

import java.util.ArrayList;

public class ListMusicActivity extends AppCompatActivity {
    MusicAdapter musicAdapter;
    ArrayList<Music_Entity> arrayList;
    ListView listMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_music);

        getData();
        musicAdapter = new MusicAdapter(ListMusicActivity.this, R.layout.music_item, arrayList);
        listMusic = (ListView) findViewById(R.id.list_music);
        listMusic.setAdapter(musicAdapter);

        /*Thu xem click vao item co ra giao dien play nhac ko*/
        listMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 Intent intent =new Intent(view.getContext(),MusicPlayer.class);
                                                 startActivity(intent);
                                             }
                                         }
        );




    }
    private void getData() {
        arrayList = new ArrayList<Music_Entity>();
        arrayList.add(new Music_Entity(1, "Con Cò Bé Bé", "Xuân Mai", R.drawable.note_music_icon));
        arrayList.add(new Music_Entity(1, "Bé Lên 3", "Unknow", R.drawable.note_music_icon));
        arrayList.add(new Music_Entity(1, "Chú Voi Con", "Unknow", R.drawable.note_music_icon));
        arrayList.add(new Music_Entity(1, "Như có Bác Hồ", "Unknow", R.drawable.note_music_icon));
        arrayList.add(new Music_Entity(1, "Một con vịt", "Unknow", R.drawable.note_music_icon));
    }


}
