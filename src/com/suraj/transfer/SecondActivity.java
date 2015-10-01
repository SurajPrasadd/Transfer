package com.suraj.transfer;

import android.net.NetworkInfo.DetailedState;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView n,t1,t2,t3,t4,name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		n=(TextView) findViewById(R.id.textView12);
		t1=(TextView) findViewById(R.id.textView1);
		t2=(TextView) findViewById(R.id.textView2);
		t3=(TextView) findViewById(R.id.textView3);
		t4=(TextView) findViewById(R.id.textView4);
		name=(TextView) findViewById(R.id.textView5);
		
		Intent inter=getIntent();
		Bundle b1=inter.getExtras();
		String s1=b1.getString("key2");
		//double l= Double.parseDouble(b1.getString("key1"));
		double l= b1.getDouble("key1");
	
	    
		name.setText(s1);
		n.setText(conv(l));
		t1.setText(conv(5*l));
		t2.setText(conv(5+l));
		t3.setText(conv(5-l));
		t4.setText(conv(5/l));
		
	}
		
		
		
		
	
	private String conv(double l) {
		
		return Double.toString(l);
	}





	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
