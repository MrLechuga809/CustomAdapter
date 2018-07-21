package com.eleo95.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.mylistview);

        //create array
        final List<User> items = new ArrayList<>();
        items.add(new User("Eddy Jr.","C/ Jacobo Majluta B1-301"));
        items.add(new User("Alexander","C/ Jacobo Majluta B1-301"));
        items.add(new User("Yissel","C/ Privada #97"));
        items.add(new User("Gertrudis","C/ Privada #97"));
        items.add(new User("Alejandrina","C/ Privada #97"));
        items.add(new User("Melania","C/ Benito Moncion #74"));
        items.add(new User("Susana","C/ Central #47"));
        items.add(new User("Lucrecia","C/ Central #47"));

        UserAdapter adapter = new UserAdapter(this, items);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User userSelect = items.get(position);
                Toast.makeText(MainActivity.this, "item clicked ->"+userSelect.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
