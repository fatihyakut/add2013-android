package org.gdgankara.app.activities;

import org.gdgankara.app.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button tweetWallButton;
	private Button programButton;
	private Button haritaButton;
	private Button oturumButton;
	private Button sponsorButton;
	private Button favoriButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		setUpButtons();
		buttonsActive();

	}
	
	private void setUpButtons(){
		tweetWallButton = (Button) findViewById(R.id.tweetWall);
		favoriButton = (Button) findViewById(R.id.favori_button);
		haritaButton=(Button) findViewById(R.id.harita_button);
		sponsorButton=(Button) findViewById(R.id.sponsor_button);
		oturumButton=(Button) findViewById(R.id.oturum_button);
		programButton=(Button) findViewById(R.id.program_button);
	}
	
	private void buttonsActive(){
		tweetWallButton.setOnClickListener(this);
		favoriButton.setOnClickListener(this);
		haritaButton.setOnClickListener(this);
		sponsorButton.setOnClickListener(this);
		oturumButton.setOnClickListener(this);
		programButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		Intent i=null;
		
		switch(arg0.getId()){
		
		case R.id.tweetWall:
			i = new Intent(MainActivity.this , TweetWallActivity.class);
			break;
			
		case R.id.program_button:
			break;
			
		case R.id.harita_button:
			i = new Intent(MainActivity.this, MyMapActivity.class);
			break;
			
		case R.id.sponsor_button:
			break;
			
		case R.id.oturum_button:
			break;
			
		case R.id.favori_button:
			break;
		}
		
		startActivity(i);
		
	}

}
