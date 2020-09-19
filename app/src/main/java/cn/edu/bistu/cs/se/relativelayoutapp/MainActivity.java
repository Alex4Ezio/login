package cn.edu.bistu.cs.se.relativelayoutapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.AlteredCharSequence;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Scanner type = new Scanner(System.in);
        final String UserId = type.next();
        Scanner type2 = new Scanner(System.in);
        final String Pwd = type2.next();

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("确认操作");
                builder.setMessage("确认登录？");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (UserId == "abc" || Pwd == "123") {
                            Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.setNegativeButton("取消",null);
                builder.show();
            }
        });
        button2=(Button)findViewById(R.id.button2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
