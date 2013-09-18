package com.example.trailtracer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ParametersListAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ListView listview = (ListView) findViewById(R.id.listViewParameters);
		
		mAdapter = new ParametersListAdapter(this);
        for (int i = 0; i < 50; i++) {
            mAdapter.addItem("item " + i);
        }
        
        System.out.println("Yo : "+listview);
        listview.setAdapter(mAdapter);
        		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
