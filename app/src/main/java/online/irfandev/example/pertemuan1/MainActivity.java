package online.irfandev.example.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPesanDua,btnTampilkanNama,btnTambah,btnKurang,btnKali,btnBagi,btnWhile,btnDoWhile,btnFor;
    EditText etNama,etBil1,etBil2,etHasil;
    TextView tvBilangan;

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
        btnTampilkanNama=(Button)findViewById(R.id.btnTampilkanNama);
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
                prosesMatematika("Tambah");
            }
        });

        btnKurang=(Button)findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kurang");
            }
        });

        btnKali=(Button)findViewById(R.id.btnKali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kali");
            }
        });

        btnBagi=(Button)findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Bagi");
            }
        });

        tvBilangan=(TextView)findViewById(R.id.tvBilangan);

        btnWhile=(Button)findViewById(R.id.btnWhile);
        btnWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil=2;
                tvBilangan.setText("");
                while (bil<=20){
                    tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                    bil+=2;
                }
            }
        });

        btnDoWhile=(Button)findViewById(R.id.btnDoWhilw);
        btnDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil=1;
                tvBilangan.setText("");
                do{
                    tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                    bil+=2;
                }while (bil<=20);
            }
        });

        btnFor=(Button)findViewById(R.id.btnFor);
        btnFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBilangan.setText("");
                for (int bil = 1; bil <= 10; bil++) {
                    tvBilangan.setText(tvBilangan.getText().toString()+String.valueOf(bil)+",");
                }
            }
        });
    }

    public void tampilkanPesan(View view){
        Toast.makeText(MainActivity.this,"Selamat Belajar Android",Toast.LENGTH_LONG).show();
    }

    void prosesMatematika(String jenisproses){
        if(statusIsian()==true){
            ProsesHitung2 proseshitung2 =new ProsesHitung2(Double.valueOf(etBil1.getText().toString()),Double.valueOf(etBil2.getText().toString()));

            if (jenisproses.equalsIgnoreCase("Tambah")){
                etHasil.setText(String.valueOf(proseshitung2.getTambah()));
            }else if (jenisproses.equalsIgnoreCase("Kurang")){
                etHasil.setText(String.valueOf(proseshitung2.getKurang()));
            }else if (jenisproses.equalsIgnoreCase("Bagi")){
                etHasil.setText(String.valueOf(proseshitung2.getBagi()));
            }else if (jenisproses.equalsIgnoreCase("Kali")){
                etHasil.setText(String.valueOf(proseshitung2.getKali()));
            }
        }
    }

    boolean statusIsian(){
        boolean vstatus=true;
        if (etBil1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Bilangan satu harap diisi",Toast.LENGTH_SHORT).show();
            etBil1.requestFocus();
            vstatus=false;
        } else if (etBil2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Bilangan dua harap diisi", Toast.LENGTH_SHORT).show();
            etBil2.requestFocus();
            vstatus=false;
        }
        return vstatus;
    }
}
