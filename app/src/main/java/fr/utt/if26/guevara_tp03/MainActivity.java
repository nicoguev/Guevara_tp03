package fr.utt.if26.guevara_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Méthode appelé à la création de l'activité
     * @param savedInstanceState
     * Sauvegarde de l'instance de l'activité
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx = (TextView)findViewById(R.id.textView);

        String message1 = new String("test");
        tx.setText(message1);

        String message2 = getResources().getString(R.string.message);
        tx.setText(message2);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
