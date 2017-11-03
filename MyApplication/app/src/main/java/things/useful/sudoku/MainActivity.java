package things.useful.sudoku;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static things.useful.sudoku.Tabela.brojUnosa;


public class MainActivity extends AppCompatActivity {

    Button buttEasy;
    Button buttMedium;
    Button buttHard;
    Button buttCustom;

    Button buttonABOUT;

    Button cancel;

    SeekBar seekBar;
    TextView textView2;
    public static int slider;

    public static int [] niz1BB = new int[81];
    public static int [] niz1BKlikabilno = new int[81];
    public static boolean nizovaProvera = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);



        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        buttEasy = (Button)findViewById(R.id.buttEasy);
        buttMedium = (Button)findViewById(R.id.buttMedium);
        buttHard = (Button)findViewById(R.id.buttHard);
        buttCustom = (Button)findViewById(R.id.buttCustom);
        buttonABOUT = (Button)findViewById(R.id.buttonABOUT);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        textView2 = (TextView)findViewById(R.id.textView2);
        cancel = (Button)findViewById(R.id.but_cancel);



        buttEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,Tabela.class);
                toy.putExtra("Procenat", 70);
                startActivity(toy);
            }
        });

        buttMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,Tabela.class);
                toy.putExtra("Procenat", 40);
                startActivity(toy);

            }
        });

        buttHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,Tabela.class);
                toy.putExtra("Procenat", 25);
                startActivity(toy);

            }
        });

        buttCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,Tabela.class);
                toy.putExtra("Procenat", slider);
                startActivity(toy);

            }
        });
        buttonABOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showABOUT();
            }
        });



        seekBar.setMax(79);
        seekBar.setProgress(30);
        slider = seekBar.getProgress()+20;



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                // TODO Auto-generated method stub

                float joker = (progress+300)/10;
                textView2.setTextSize(joker);
                textView2.setText(String.valueOf(progress+20));
                buttCustom.setText(getResources().getString(R.string.custom) + " " + String.valueOf(progress+20) + "%");
                slider = progress+20;
                //Toast.makeText(getApplicationContext(), String.valueOf(progress),Toast.LENGTH_LONG).show();

            }
        });
    }

    /*private void showABOUT() {
        new AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.info))
                .setMessage("Camera flashlight not available in this Android device!")

                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }*/

    private void showABOUT(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_layout_about);
        dialog.setCancelable(false);
        dialog.setTitle(getResources().getString(R.string.info));
        cancel = (Button) dialog.findViewById(R.id.but_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        brojUnosa = 0;
        //Log.i(TAG, "On Start .....");
    }

    @Override
    public void onBackPressed() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(getResources().getString(R.string.exitMain))
                .setCancelable(false)
                .setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();

    }
}
