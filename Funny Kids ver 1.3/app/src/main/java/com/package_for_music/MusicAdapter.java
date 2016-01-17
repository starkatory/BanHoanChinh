package com.package_for_music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NamAnh on 1/8/2016.
 */
public class MusicAdapter extends ArrayAdapter<Music_Entity> {
    ArrayList<Music_Entity> arrayList=null;

    public MusicAdapter(Context context, int resource, List<Music_Entity> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater;
            inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.music_item,null);
        }
        Music_Entity currentMusic = getItem(position);
        TextView txtSong,txtSinger;
        ImageView imgMusic;
        txtSong = (TextView) convertView.findViewById(R.id.txt_song_name);
        txtSinger = (TextView) convertView.findViewById(R.id.txt_singer);
        imgMusic = (ImageView) convertView.findViewById(R.id.img_music);

        txtSong.setText(currentMusic.getSong());
        txtSinger.setText(currentMusic.getSinger());
        imgMusic.setImageResource(currentMusic.getImage());
        return convertView;

    }

}
