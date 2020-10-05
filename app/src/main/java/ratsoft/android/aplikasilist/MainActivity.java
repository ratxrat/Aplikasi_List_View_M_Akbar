package ratsoft.android.aplikasilist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private String[] negara = {"Indonesia","Singapura","Kamboja","Myanmar","Brazil","Italia","mesir","Timor Leste","Australia","Maroko","vietnam","Kanada","USA","Karibia","Kuba","Senegal","Afganistan","Selandia Baru","Spanyol","Tiongkok","Korea Utara","Jepang"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Aplikasi Listview Sederhana");
        listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,negara);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Memilih Negara :"+negara[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}