package com.zhiyuan3g.alertdialog;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnAlert, btnAlerts, btnAler, btnA, btn5,btn6;

    String[] items = {"爱你", "不爱你", "非常爱你"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = (Button) findViewById(R.id.btnAlert);
        btnAlerts = (Button) findViewById(R.id.btnAlerts);
        btnAler = (Button) findViewById(R.id.btnAler);
        btnA = (Button) findViewById(R.id.btnA);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("弹框")
                        .setMessage("夸夸我 ）；")
                        .setNegativeButton("不好", null)
                        .setPositiveButton("是的", null).create().show();
            }
        });


        btnAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("爱我吗？？")
                        .setItems(items, null)
                        .setPositiveButton("确定", null)
                        .setNegativeButton("取消", null).create().show();
            }
        });

        btnAler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("我是帅哥")
                        .setSingleChoiceItems(items, 0, null)
                        .setPositiveButton("确定", null)
                        .setNegativeButton("取消", null).create().show();

            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("我是美女")
                        .setMultiChoiceItems(items, null, null)
                        .setPositiveButton("确定", null)
                        .setNegativeButton("取消", null).create().show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("请输入");
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.input, null);
                builder.setView(view);

                final EditText edt = (EditText) view.findViewById(R.id.edt);

                builder.setPositiveButton("确定", null);
                builder.setNegativeButton("取消", null);
                builder.create().show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dialog=ProgressDialog.show(MainActivity.this,"下载","下载中...",true);

                //点击返回按钮，Dialog消失
                dialog.setCancelable(true);
            }
        });
    }
}
