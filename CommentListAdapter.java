/*
작성자: 노다민
학번: 2019039082
파일명: CommentListAdapter.java
구현사항: xml과 java파일을 연결하는 Comment Adapter 구현
 */

package sdk.chat.gp_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import sdk.chat.gp_app.R;
import sdk.chat.gp_app.view.CommentListView;

public class CommentListAdapter extends BaseAdapter {
    Context context;
    ArrayList<CommentListView> items;

    public CommentListAdapter(Context context, ArrayList<CommentListView> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_comments_list, null);
        }

        CommentListView people = (CommentListView) getItem(position);
        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView nickname = convertView.findViewById(R.id.nickname);

        image.setImageResource(people.getSrc());
        name.setText(people.getName());
        nickname.setText(people.getNickname());

        return convertView;
    }
}