package com.DefaultCompany.ExtendUnityPlayerActivity;
import com.unity3d.player.UnityPlayerActivity;
import android.os.Bundle;
import android.util.Log;

public class OverrideExample extends UnityPlayerActivity {
  protected void onCreate(Bundle savedInstanceState) {
    // UnityPlayerActivity.onCreate() を呼び出す
    super.onCreate(savedInstanceState);
    // logcat にデバッグメッセージをプリントする
    Log.d("OverrideActivity", "onCreate called!");
  }
  public void onBackPressed()
  {
    // UnityPlayerActivity.onBackPressed() を呼び出す代わりに、Back ボタンイベントを無視する
    // super.onBackPressed();
  }
}