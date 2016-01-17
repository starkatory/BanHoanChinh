package com.package_for_video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.package_for_story.Story_Entity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 14/01/2016.
 */
public class VideoAdapter extends ArrayAdapter<Video_Entity> {
    ArrayList<Video_Entity> arrayList=null;

    public VideoAdapter(Context context, int resource, List<Video_Entity> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater;
            inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.video_item,null);
        }
     Video_Entity currentVideo = getItem(position);
        TextView txtVideo,txtAuthor;
        ImageView imgVideo;
        txtVideo = (TextView) convertView.findViewById(R.id.txt_video_name);
        txtAuthor = (TextView) convertView.findViewById(R.id.txt_author);
        imgVideo = (ImageView) convertView.findViewById(R.id.video_icon_item);

        txtVideo.setText(currentVideo.getVideo());
        txtAuthor.setText(currentVideo.getAuthor());
        imgVideo.setImageResource(currentVideo.getImage());
        return convertView;

    }

}
