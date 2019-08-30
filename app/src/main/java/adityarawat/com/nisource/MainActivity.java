package adityarawat.com.nisource;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText urlText;
    private Button forgotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlText = findViewById(R.id.urlEditText);
        forgotButton = findViewById(R.id.forgotButton);

        forgotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(urlText.getText().length() == 0){
                    urlText.setError("URL must not be left blank!");
                }
                else{
                    Intent myIntent = new Intent(MainActivity.this, webViewActivity.class);
                    myIntent.putExtra("urlKey", urlText.getText().toString()); //Optional parameters
                    startActivity(myIntent);
                }
            }
        });
    }
}
