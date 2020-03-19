package online.irfandev.example.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPesanDua,btnTampilkanNama,btnTambah,btnKurang,btnKali,btnBagi;
    EditText etNama,etBil1,etBil2,etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPesanDua=(Button)findViewById(R.id.btnPesanDua);
        btnPesanDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"ini dari tombol dua",Toast.LENGTH_SHORT).show();
            }
        });

        etNama=(EditText)findViewById(R.id.etNama);
        btnTampilkanNama=(Button)findViewById(R.id.etNama);
        btnTampilkanNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        etBil1=(EditText)findViewById(R.id.etBil1);
        etBil2=(EditText)findViewById(R.id.etBil2);
        etHasil=(EditText)findViewById(R.id.etHasil);

        btnTambah=(Button)findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1=Double.valueOf(etBil1.getText().toString());
                double vbil2=Double.valueOf(etBil2.getText().toString());
                double vhasil=vbil1+vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });

        btnKurang=(Button)findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1=Double.valueOf(etBil1.getText().toString());
                double vbil2=Double.valueOf(etBil2.getText().toString());
                double vhasil=vbil1-vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });

        btnKali=(Button)findViewById(R.id.btnKali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1=Double.valueOf(etBil1.getText().toString());
                double vbil2=Double.valueOf(etBil2.getText().toString());
                double vhasil=vbil1*vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });

        btnBagi=(Button)findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1=Double.valueOf(etBil1.getText().toString());
                double vbil2=Double.valueOf(etBil2.getText().toString());
                double vhasil=vbil1/vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });
    }

    public void tampilkanPesan(View view){
        Toast.makeText(MainActivity.this,"Selamat Belajar Android",Toast.LENGTH_LONG).show();
    }
}
