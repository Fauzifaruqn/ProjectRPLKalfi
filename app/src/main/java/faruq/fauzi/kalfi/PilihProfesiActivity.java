package faruq.fauzi.kalfi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PilihProfesiActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesi);
    }
    public void jadInseminator (View view) {
        Intent intent = new Intent(PilihProfesiActivity.this, DaftarInseminator.class);
        startActivity(intent);
    }
    public void jadPeternak (View view) {
        Intent intent = new Intent(PilihProfesiActivity.this, DaftarPeternak.class);
        startActivity(intent);
    }
}

