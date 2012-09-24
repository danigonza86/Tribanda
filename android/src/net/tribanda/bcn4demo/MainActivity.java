package net.tribanda.bcn4demo;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;
import android.os.Bundle;

public class MainActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getSupportActionBar().setTitle("Example!");
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
    	MenuInflater inflater = this.getSupportMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
