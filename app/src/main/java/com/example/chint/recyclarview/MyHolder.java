package com.example.chint.recyclarview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chint on 6/24/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView title, desc, btitle, bdesc;
    public ImageView img, bimg;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.text1);
        desc = (TextView) itemView.findViewById(R.id.text2);

        btitle = (TextView) itemView.findViewById(R.id.text3);
        bdesc = (TextView) itemView.findViewById(R.id.text4);

        img = (ImageView) itemView.findViewById(R.id.image);
        bimg = (ImageView) itemView.findViewById(R.id.image2);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
