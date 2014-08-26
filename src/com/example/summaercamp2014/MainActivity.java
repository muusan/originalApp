package com.example.summaercamp2014;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageButton shibu;
	GridLayout syosetsu;
	ImageView imageView;
	// GridLayout gakuhu;
	int i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		shibu = (ImageButton) findViewById(R.id.imageButton1);
		syosetsu = (GridLayout) findViewById(R.id.gridLayout1);
		syosetsu.setColumnCount(3);
		// gakuhu = (GridLayout) findViewById(R.id.gridLayout1);

	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {// ビューが見える状態になってから呼ばれているようなのでここで取得する
		// syosetsuの位置を取得する
		int[] location = new int[2];
		syosetsu.getLocationOnScreen(location);
		// syosetsuの高さと幅の長さを取得
		int w = syosetsu.getWidth(), h = syosetsu.getHeight();

	}

	public void onShibu(View v) {
		// gridlayoutのパラメータを作成
		GridLayout.LayoutParams params1 = new GridLayout.LayoutParams();
		params1.width = syosetsu.getWidth() / 4; // syosetsuの横幅 / 4
		params1.height = syosetsu.getHeight() / 2;
		params1.columnSpec = GridLayout.spec(i);
		params1.rowSpec = GridLayout.spec(0);

		// imageViewを作成
		imageView = new ImageView(this);
		imageView.setLayoutParams(params1);
		imageView.setImageResource(R.drawable.shibu);

		// syosetsuに追加
		syosetsu.addView(imageView);

		// System.out.println("やったよ！: width: " + params1.width);

		// 次の区切りに進む
		i++;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
