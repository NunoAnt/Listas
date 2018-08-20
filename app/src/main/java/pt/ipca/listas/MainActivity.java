package pt.ipca.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.main_list);

        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car(R.drawable.ferrari, "Ferrari"));
        cars.add(new Car(R.drawable.bm, "BMW"));
        cars.add(new Car(R.drawable.mercedes, "Mercedes"));
        cars.add(new Car(R.drawable.porshe, "Porshe"));

        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, cars);

        listView.setAdapter(adapter);
    }
}
