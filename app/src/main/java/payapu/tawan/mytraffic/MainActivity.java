package payapu.tawan.mytraffic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    // Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method
} //Main Class

