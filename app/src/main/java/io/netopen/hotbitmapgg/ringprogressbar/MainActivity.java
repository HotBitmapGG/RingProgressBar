package io.netopen.hotbitmapgg.ringprogressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;

public class MainActivity extends AppCompatActivity
{

    private RingProgressBar mRingProgressBar;

    private int progress = 0;

    private Handler mHandler = new Handler()
    {

        @Override
        public void handleMessage(Message msg)
        {

            if (msg.what == 0)
            {
                progress++;
                mRingProgressBar.setProgress(progress);
                mRingProgressBar.setOnProgressListener(new RingProgressBar.OnProgressListener()
                {

                    @Override
                    public void progressToComplete()
                    {

                        Toast.makeText(MainActivity.this, "完成", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRingProgressBar = (RingProgressBar) findViewById(R.id.progress_bar);

        new Thread(new Runnable()
        {

            @Override
            public void run()
            {

                for (int i = 0; i < 100; i++)
                {
                    try
                    {
                        Thread.sleep(100);

                        mHandler.sendEmptyMessage(0);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    protected void onDestroy()
    {

        super.onDestroy();

        mHandler.removeCallbacksAndMessages(null);
    }
}
