package artn.lab10;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorsAdapter extends BaseAdapter {

    private String[] elements;

    public ColorsAdapter(String[] lwElem) {
        elements = lwElem;
    }

    @Override
    public int getCount() {
        return elements.length;
    }

    @Override
    public Object getItem(int position) {
        return elements[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lw_lay, parent, false);
        }
        TextView textView = (TextView) convertView;
        textView.setText(elements[position]);
        if (position % 2 == 0)
            textView.setBackgroundColor(Color.CYAN);
        else
            textView.setBackgroundColor(Color.MAGENTA);
        return convertView;
    }
}
