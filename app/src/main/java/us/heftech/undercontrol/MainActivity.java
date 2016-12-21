package us.heftech.undercontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import us.heftech.undercontrol.UserInfo.User;

public class MainActivity extends AppCompatActivity {
    private Button mAddEntryButton;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddEntryButton = (Button) findViewById(R.id.addEntryButton);
        mAddEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
