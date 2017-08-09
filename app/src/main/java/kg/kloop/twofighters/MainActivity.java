package kg.kloop.twofighters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView healthView1, healthView2;
    private Button hit1, hit2, kick1, kick2;
    private Fighter fighter1, fighter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        fighter1 = new Fighter();
        fighter1.setDefense(80);
        fighter1.setHealth(100);
        fighter1.setPower(50);
        fighter1.setAgility(120);
        fighter2 = new Fighter();
        fighter2.setDefense(90);
        fighter2.setHealth(100);
        fighter2.setPower(90);
        fighter2.setAgility(60);
        update();
        initListeners();
    }

    private void initListeners() {
        hit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fighter1.hit(fighter2);
                update();
            }
        });

        hit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fighter2.hit(fighter1);
                update();
            }
        });

        kick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fighter1.kick(fighter2);
                update();
            }
        });

        kick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fighter2.kick(fighter1);
                update();
            }
        });
    }

    private void update() {
        healthView1.setText(String.valueOf(fighter1.getHealth()));
        healthView2.setText(String.valueOf(fighter2.getHealth()));
    }

    private void init() {
        healthView1 = (TextView)findViewById(R.id.fighterHealthView1);
        healthView2 = (TextView)findViewById(R.id.fighterHealthView2);
        hit1 = (Button)findViewById(R.id.hit1);
        hit2 = (Button)findViewById(R.id.hit2);
        kick1 = (Button)findViewById(R.id.kick1);
        kick2 = (Button)findViewById(R.id.kick2);

    }
}
