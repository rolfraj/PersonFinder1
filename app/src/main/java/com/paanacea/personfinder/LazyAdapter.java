package com.paanacea.personfinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.paanacea.personfinder.data.Person;

public class LazyAdapter extends BaseAdapter {
    
    private Activity activity;
    private List<Person> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader; 
    
    public LazyAdapter(Activity a, List<Person> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView title = (TextView)vi.findViewById(R.id.fullName); // title
        TextView artist = (TextView)vi.findViewById(R.id.home); // artist name
        TextView duration = (TextView)vi.findViewById(R.id.duration); // duration
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image
        
        //HashMap<String, String> song = new HashMap<String, String>();
        //song = data.get(position);

        Person person = data.get(position);

        
        // Setting all values in listview
        title.setText(person.getFull_name());
        artist.setText(person.getHome_city() + " " + person.getHome_state());
        duration.setText(person.getEntry_date().toString());
        if(person.getPhoto_url() != null)
        {
            imageLoader.DisplayImage(person.getPhoto_url(), thumb_image);
        }
        return vi;
    }
}