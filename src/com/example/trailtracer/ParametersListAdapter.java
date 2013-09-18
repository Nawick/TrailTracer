package com.example.trailtracer;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ParametersListAdapter extends BaseAdapter {

	 private ArrayList<String> mData = new ArrayList();
     private LayoutInflater mInflater;
	
     public ParametersListAdapter(Context mContext) {
    	 mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);    	 
	}
     
     public void addItem(final String item) {
         mData.add(item);
         notifyDataSetChanged();
     }
     
	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
        return position;
    }

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		System.out.println("getView " + position + " " + convertView);
		
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_activate, null);
            holder = new ViewHolder();
            holder.textView = (TextView)convertView.findViewById(R.id.textView1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.textView.setText((CharSequence) mData.get(position));
        return convertView;
	}

	
	public static class ViewHolder {
        public TextView textView;
    }
}
