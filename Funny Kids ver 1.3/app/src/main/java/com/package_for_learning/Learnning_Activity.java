package com.package_for_learning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 15/01/2016.
 */
public class Learnning_Activity extends Activity {
    GridView grid;
    String[] letter = {"1","2","3","4","5","6","7","8","9","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    int[] imgId = {
            R.drawable.alphabet_item_1,
            R.drawable.alphabet_item_2,
            R.drawable.alphabet_item_3,
            R.drawable.alphabet_item_4,
            R.drawable.alphabet_item_5,
            R.drawable.alphabet_item_6,
            R.drawable.alphabet_item_7,
            R.drawable.alphabet_item_8,
            R.drawable.alphabet_item_9,
            R.drawable.alphabet_item_a,
            R.drawable.alphabet_item_b,
            R.drawable.alphabet_item_c,
            R.drawable.alphabet_item_d,
            R.drawable.alphabet_item_e,
            R.drawable.alphabet_item_f,
            R.drawable.alphabet_item_g,
            R.drawable.alphabet_item_h,
            R.drawable.alphabet_item_i,
            R.drawable.alphabet_item_j,
            R.drawable.alphabet_item_k,
            R.drawable.alphabet_item_l,
            R.drawable.alphabet_item_m,
            R.drawable.alphabet_item_n,
            R.drawable.alphabet_item_o,
            R.drawable.alphabet_item_p,
            R.drawable.alphabet_item_q,
            R.drawable.alphabet_item_r,
            R.drawable.alphabet_item_s,
            R.drawable.alphabet_item_t,
            R.drawable.alphabet_item_u,
            R.drawable.alphabet_item_v,
            R.drawable.alphabet_item_w,
            R.drawable.alphabet_item_x,
            R.drawable.alphabet_item_y,
            R.drawable.alphabet_item_z,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabel_list);
        CustomGridAlphabet adapter = new CustomGridAlphabet(Learnning_Activity.this, letter, imgId);
        grid = (GridView) findViewById(R.id.gridvAlphabel);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Learnning_Activity.this, "You Clicked at " +letter[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

    }
