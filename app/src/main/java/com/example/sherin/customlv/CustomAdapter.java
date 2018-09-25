package com.example.sherin.customlv;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    String[] names;
    String[] details;
    int[] images;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.names = names;
        this.images = images;
        this.details=details;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view==null){

            view =   inflater.inflate(R.layout.sample_layout, null);

        }

        ImageView imageView = view.findViewById(R.id.pictureId);
        TextView textView = view.findViewById(R.id.nameId);
        TextView description=view.findViewById(R.id.descriptionId);


        imageView.setImageResource(images[i]);
        textView.setText(names[i]);
        description.setText(details[i]);

        return view;
    }
}