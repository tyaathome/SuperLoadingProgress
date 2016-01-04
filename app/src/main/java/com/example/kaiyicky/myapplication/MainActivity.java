package com.example.kaiyicky.myapplication;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {
    SuperLoadingProgress mSuperLoadingProgress;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSuperLoadingProgress = (SuperLoadingProgress) findViewById(R.id.pro);
//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                new Thread(){
//                    @Override
//                    public void run() {
//                        try {
//                            mSuperLoadingProgress.setProgress(0);
//                            while(mSuperLoadingProgress.getProgress()<100) {
//                                Thread.sleep(10);
//                                mSuperLoadingProgress.setProgress(mSuperLoadingProgress.getProgress() + 1);
//                            }
//                            mSuperLoadingProgress.finishFail();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }.start();
//            }
//        });
//
//        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                new Thread(){
//                    @Override
//                    public void run() {
//                        try {
//                            mSuperLoadingProgress.setProgress(0);
//                            while(mSuperLoadingProgress.getProgress()<100) {
//                                Thread.sleep(10);
//                                mSuperLoadingProgress.setProgress(mSuperLoadingProgress.getProgress() + 1);
//                            }
//                            mSuperLoadingProgress.finishSuccess();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }.start();
//            }
//        });

        Button start = (Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSuperLoadingProgress.startLoading();
            }
        });

        Button btn1 = (Button) findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        try {
                            mSuperLoadingProgress.setProgress(0);
                            while(mSuperLoadingProgress.getProgress()<100) {
                                Thread.sleep(50);
                                mSuperLoadingProgress.setProgress(mSuperLoadingProgress.getProgress() + 1);
                            }
                            mSuperLoadingProgress.finishFail();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        try {
                            mSuperLoadingProgress.setProgress(0);
                            while(mSuperLoadingProgress.getProgress()<100) {
                                Thread.sleep(50);
                                mSuperLoadingProgress.setProgress(mSuperLoadingProgress.getProgress() + 1);
                            }
                            mSuperLoadingProgress.finishSuccess();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
    }
    
}
