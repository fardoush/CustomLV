package com.example.sherin.customlv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private ListView listView;

    private int[] pictures = {R.drawable.shakib, R.drawable.mashrafe,
            R.drawable.tamim, R.drawable.mushfiqur, R.drawable.mustafizur,
            R.drawable.mahmudulla,R.drawable.taskin,R.drawable.sabbir,
            R.drawable.sarkar,R.drawable.mehidy,R.drawable.nasir};

    private String[] names = {"Shakib Al Hasan", "Mashrafe Mortaza",
            "Tamim Iqbal", "Mushfiqur Rahim", "Mustafizur Rahman",
            "Mahmudullah", "Taskin Ahmed","Sabbir Rahman",
            "Soumya Sarkar","Mehidy Hasan","Nasir Hossain"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        listView = findViewById(R.id.lvId);

        CustomAdapter adapter = new CustomAdapter(this,
                names, pictures);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String title = names[i];
                Toast.makeText(MainActivity.this, "" + title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

