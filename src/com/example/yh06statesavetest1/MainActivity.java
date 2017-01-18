package com.example.yh06statesavetest1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText et;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i("TEST", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (EditText) findViewById(R.id.et);
		tv = (TextView) findViewById(R.id.tv);
		if(savedInstanceState!=null){
		String data =savedInstanceState.getString("data");
		tv.setText(data);
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.i("TEST", "onSaveInstanceState");
		outState.putString("data", et.getText().toString());//在activity destory之前把EditText中的内容保存Bundle中
		
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.i("TEST", "onRestoreInstanceState");
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
	}
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState,
			PersistableBundle persistentState) {
		Log.i("TEST", "onRestoreInstanceState");
		if(savedInstanceState!=null){
		String data1=savedInstanceState.getString("data");
		tv.setText("onRestore保存的数据"+data1);
		}
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState, persistentState);
	}
	@Override
	protected void onStart() {
		Log.i("TEST", "onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}
	@Override
	protected void onResume() {
		Log.i("TEST", "onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}
	@Override
	protected void onPause() {
		Log.i("TEST", "onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}
	@Override
	protected void onStop() {
		Log.i("TEST", "onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}
	@Override
	protected void onRestart() {
		Log.i("TEST", "onRestart");
		// TODO Auto-generated method stub
		super.onRestart();
	}
	@Override
	protected void onDestroy() {
		Log.i("TEST", "onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
