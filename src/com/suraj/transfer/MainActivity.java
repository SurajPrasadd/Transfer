package com.suraj.transfer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText num,name;
	Button tran;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        num=(EditText) findViewById(R.id.editTextnum);
        name=(EditText) findViewById(R.id.editTextname);
        tran=(Button) findViewById(R.id.button1);
        
   tran.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		if(num.length()>0 && name.length()>0){
		 Intent inte=new Intent(MainActivity.this, SecondActivity.class);
		double d= Double.parseDouble(num.getText().toString());
	    //    inte.putExtra("key1",num.getText().toString() );
	        inte.putExtra("key1",d);
	        inte.putExtra("key2", name.getText().toString());
	        startActivity(inte);}
		else if(num.length()==0 && name.length()==0){
			Toast.makeText(MainActivity.this, "inter the value", Toast.LENGTH_SHORT).show();
		}
		else if(num.length()==0 ){
			Toast.makeText(MainActivity.this, "inter number", Toast.LENGTH_SHORT).show();
		}
		else if(name.length()==0){
			Toast.makeText(MainActivity.this, "inter name", Toast.LENGTH_SHORT).show();
		}
		
	}
});
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
