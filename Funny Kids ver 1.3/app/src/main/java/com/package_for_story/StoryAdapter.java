package com.package_for_story;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import com.example.administrator.myapplication.R;
/**
 * Created by Administrator on 14/01/2016.
 */
public class StoryAdapter extends ArrayAdapter<Story_Entity> {
    ArrayList<Story_Entity> arrayList=null;

    public StoryAdapter(Context context, int resource, List<Story_Entity> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater inflater;
            inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.story_item,null);
        }
        Story_Entity currentStory = getItem(position);
        TextView txtStory,txtReader;
        ImageView imgStory;
        txtStory = (TextView) convertView.findViewById(R.id.txt_story_name);
        txtReader = (TextView) convertView.findViewById(R.id.txt_reader);
        imgStory = (ImageView) convertView.findViewById(R.id.img_story);

        txtStory.setText(currentStory.getStory());
        txtReader.setText(currentStory.getReader());
        imgStory.setImageResource(currentStory.getImage());
        return convertView;

    }

}