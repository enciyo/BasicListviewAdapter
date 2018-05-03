package com.example.enciyo.deneme.Adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.enciyo.deneme.R;
import com.example.enciyo.deneme.Repo;

import java.util.List;

public class ListviewAdapter extends BaseAdapter{
    LayoutInflater layoutInflater;
    List<Repo> list;

    public ListviewAdapter(Activity activity, List<Repo> list){
        layoutInflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list=list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View listview;
       listview=layoutInflater.inflate(R.layout.listview,null);

        ImageView ımageView=(ImageView) listview.findViewById(R.id.imageView);
        TextView title=(TextView) listview.findViewById(R.id.headtitle);
        TextView subtitle=(TextView) listview.findViewById(R.id.subtitle);
        Button button=(Button) listview.findViewById(R.id.button);

        title.setText(list.get(position).getTitle().toString());
        subtitle.setText(list.get(position).getSubtitle());
        button.setText("OnClick");

        return listview;
    }
}
