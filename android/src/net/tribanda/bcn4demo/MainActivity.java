package net.tribanda.bcn4demo;

import net.tribanda.bcn4demo.video.VideoUtil;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends SherlockActivity {

    private static final String TAG = "MainActivity";

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
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	VideoUtil.callVideoApp(this);
    	return super.onMenuItemSelected(featureId, item);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	VideoUtil.videoIntentParce(data, requestCode);
    }
    
    
    
}
