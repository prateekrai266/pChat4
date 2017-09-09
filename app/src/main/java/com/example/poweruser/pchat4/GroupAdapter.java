package com.example.poweruser.pchat4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class GroupAdapter extends ArrayAdapter<FriendlyMessage> {
    public GroupAdapter(Context context, int resource, List<FriendlyMessage> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.group_names, parent, false);
        }

        TextView authorTextView = (TextView) convertView.findViewById(R.id.group_name);

        FriendlyMessage message = getItem(position);


        authorTextView.setText(message.getName());

        return convertView;
    }
}
