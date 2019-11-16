package id.udibara.santoso.budi.recycleview3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailMakananActivity extends AppCompatActivity {


    TextView txtnama;
    TextView desc;
    ImageView gambar;

    int id;
    String nama;
    int photo;
    String detail;

    Spinner spinner;

    private String[] namaHewan =

            {
                    "Jerapah",
                    "Gajah",
                    "Kuda",
                    "Sapi"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtnama = findViewById(R.id.nama_detail);
        desc = findViewById(R.id.desc_detail);
        gambar = findViewById(R.id.image_detail);
        spinner = findViewById(R.id.spinner);

        nama = getIntent().getStringExtra("nama");
        photo = getIntent().getIntExtra("gambar", 0);
        detail = getIntent().getStringExtra("detail");

        txtnama.setText(nama);
        desc.setText(detail);
        Glide.with(getApplicationContext()).load(photo).into(gambar);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, namaHewan);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(DetailMakananActivity.this, "Kamu pelihara" + adapter.getItem(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
