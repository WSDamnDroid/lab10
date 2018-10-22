package artn.lab10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends AppCompatActivity {
    ListView lw;
    ColorsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        lw = (ListView) findViewById(R.id.listView);
        String[] res = getResources().getStringArray(R.array.lwRes);
        adapter = new ColorsAdapter(res);
        lw.setAdapter(adapter);
    }
}
