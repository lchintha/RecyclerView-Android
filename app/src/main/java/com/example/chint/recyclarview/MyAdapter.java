package com.example.chint.recyclarview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chint on 6/22/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    private List<ListItems> listItems;
    private Context context;

    public MyAdapter(List<ListItems> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public MyAdapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list, parent, false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.viewHolder holder, int position) {
        ListItems listItem = listItems.get(position);
        holder.title.setText(listItem.getTitle());
        holder.desc.setText(listItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        public TextView title, desc;
        public viewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.text1);
            desc = (TextView) itemView.findViewById(R.id.text2);
        }
    }
}
