package com.package_for_learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 15/01/2016.
 */
public class CustomGridAlphabet extends BaseAdapter {
    private Context mContext;
    private  final String[] letter;
    private final int [] imgId;

public CustomGridAlphabet (Context c,String[] letter,int[] imgId){
    mContext = c;
    this.imgId= imgId;
    this.letter=letter;

}

    @Override
    public int getCount() {
        return letter.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater =(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null){
            grid =new View(mContext);
            grid =inflater.inflate(R.layout.alphabel_item,null);
            TextView textView = (TextView) grid.findViewById(R.id.txtAlphabel_item);
            ImageView imageView =(ImageView) grid.findViewById(R.id.imgAlphabel_list);
            textView.setText(letter[position]);
            imageView.setImageResource(imgId[position]);
        }
        else {
            grid    = (View) convertView;
        }
        return grid;
    }
}
