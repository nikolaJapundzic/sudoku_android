package things.useful.sudoku;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.ArrayList;


public class Tabela extends Algoritam_brz_isecanje {

    public static String unos;
    public static String[]nizString;
    public static int brojacString;
    public static int [] niz1;  // resenje koje se prepravlja na resenje sa isecenim
    public static int [] niz3 = new int[81]; // resenje koje ce se uporediti sa resenjem niz5
    public static int brojac43 = 1;
    public static boolean flagg = true;
    public static boolean flagBRE = true;

    TextView textDialog;
    public static ProgressDialog progressDialo;

    public static int brojUnosa;
    public static String unoss;

    public static ArrayList<Button> lista;
    public static ArrayList<Button> lista2;
    public static String putINTENT;

    Button button1;Button button2;Button button3;Button button4;Button button5;Button button6;Button button7;Button button8;Button button9;

    Button button10;Button button11;Button button12;Button button13;Button button14;Button button15;Button button16;Button button17;Button button18;

    Button button19;Button button20;Button button21;Button button22;Button button23;Button button24;Button button25;Button button26;Button button27;

    Button button28;Button button29;Button button30;Button button31;Button button32;Button button33;Button button34;Button button35;Button button36;

    Button button37;Button button38;Button button39;Button button40;Button button41;Button button42;Button button43;Button button44;Button button45;

    Button button46;Button button47;Button button48;Button button49;Button button50;Button button51;Button button52;Button button53;Button button54;

    Button button55;Button button56;Button button57;Button button58;Button button59;Button button60;Button button61;Button button62;Button button63;

    Button button64;Button button65;Button button66;Button button67;Button button68;Button button69;Button button70;Button button71;Button button72;

    Button button73;Button button74;Button button75;Button button76;Button button77;Button button78;Button button79;Button button80;Button button81;

    Button buttReset;
    Button buttNewGame;

    RadioGroup radioGroup;

    RadioButton radioButton1;

    public VideoView myVideoView;

    public String path0 = "android.resource://things.useful.spreklame/" + R.raw.rek0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //new SimpleSyncTask().execute();



        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button1 = (Button)findViewById(R.id.button1);button2 = (Button)findViewById(R.id.button2);button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);button5 = (Button)findViewById(R.id.button5);button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);button8 = (Button)findViewById(R.id.button8);button9 = (Button)findViewById(R.id.button9);

        button10 = (Button)findViewById(R.id.button10);button11 = (Button)findViewById(R.id.button11);button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);button14 = (Button)findViewById(R.id.button14);button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);button17 = (Button)findViewById(R.id.button17);button18 = (Button)findViewById(R.id.button18);

        button19 = (Button)findViewById(R.id.button19);button20 = (Button)findViewById(R.id.button20);button21 = (Button)findViewById(R.id.button21);
        button22 = (Button)findViewById(R.id.button22);button23 = (Button)findViewById(R.id.button23);button24 = (Button)findViewById(R.id.button24);
        button25 = (Button)findViewById(R.id.button25);button26 = (Button)findViewById(R.id.button26);button27 = (Button)findViewById(R.id.button27);


        button28 = (Button)findViewById(R.id.button28);button29 = (Button)findViewById(R.id.button29);button30 = (Button)findViewById(R.id.button30);
        button31 = (Button)findViewById(R.id.button31);button32 = (Button)findViewById(R.id.button32);button33 = (Button)findViewById(R.id.button33);
        button34 = (Button)findViewById(R.id.button34);button35 = (Button)findViewById(R.id.button35);button36 = (Button)findViewById(R.id.button36);

        button37 = (Button)findViewById(R.id.button37);button38 = (Button)findViewById(R.id.button38);button39 = (Button)findViewById(R.id.button39);
        button40 = (Button)findViewById(R.id.button40);button41 = (Button)findViewById(R.id.button41);button42 = (Button)findViewById(R.id.button42);
        button43 = (Button)findViewById(R.id.button43);button44 = (Button)findViewById(R.id.button44);button45 = (Button)findViewById(R.id.button45);

        button46 = (Button)findViewById(R.id.button46);button47 = (Button)findViewById(R.id.button47);button48 = (Button)findViewById(R.id.button48);
        button49 = (Button)findViewById(R.id.button49);button50 = (Button)findViewById(R.id.button50);button51 = (Button)findViewById(R.id.button51);
        button52 = (Button)findViewById(R.id.button52);button53 = (Button)findViewById(R.id.button53);button54 = (Button)findViewById(R.id.button54);


        button55 = (Button)findViewById(R.id.button55);button56 = (Button)findViewById(R.id.button56);button57 = (Button)findViewById(R.id.button57);
        button58 = (Button)findViewById(R.id.button58);button59 = (Button)findViewById(R.id.button59);button60 = (Button)findViewById(R.id.button60);
        button61 = (Button)findViewById(R.id.button61);button62 = (Button)findViewById(R.id.button62);button63 = (Button)findViewById(R.id.button63);

        button64 = (Button)findViewById(R.id.button64);button65 = (Button)findViewById(R.id.button65);button66 = (Button)findViewById(R.id.button66);
        button67 = (Button)findViewById(R.id.button67);button68 = (Button)findViewById(R.id.button68);button69 = (Button)findViewById(R.id.button69);
        button70 = (Button)findViewById(R.id.button70);button71 = (Button)findViewById(R.id.button71);button72 = (Button)findViewById(R.id.button72);

        button73 = (Button)findViewById(R.id.button73);button74 = (Button)findViewById(R.id.button74);button75 = (Button)findViewById(R.id.button75);
        button76 = (Button)findViewById(R.id.button76);button77 = (Button)findViewById(R.id.button77);button78 = (Button)findViewById(R.id.button78);
        button79 = (Button)findViewById(R.id.button79);button80 = (Button)findViewById(R.id.button80);button81 = (Button)findViewById(R.id.button81);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);

        lista = new ArrayList<>();
        lista2 = new ArrayList<>();

        lista.add(button1);lista.add(button2);lista.add(button3);lista.add(button4);lista.add(button5);lista.add(button6);lista.add(button7);lista.add(button8);lista.add(button9);
        lista.add(button10);lista.add(button11);lista.add(button12);lista.add(button13);lista.add(button14);lista.add(button15);lista.add(button16);lista.add(button17);lista.add(button18);
        lista.add(button19);lista.add(button20);lista.add(button21);lista.add(button22);lista.add(button23);lista.add(button24);lista.add(button25);lista.add(button26);lista.add(button27);

        lista.add(button28);lista.add(button29);lista.add(button30);lista.add(button31);lista.add(button32);lista.add(button33);lista.add(button34);lista.add(button35);lista.add(button36);
        lista.add(button37);lista.add(button38);lista.add(button39);lista.add(button40);lista.add(button41);lista.add(button42);lista.add(button43);lista.add(button44);lista.add(button45);
        lista.add(button46);lista.add(button47);lista.add(button48);lista.add(button49);lista.add(button50);lista.add(button51);lista.add(button52);lista.add(button53);lista.add(button54);

        lista.add(button55);lista.add(button56);lista.add(button57);lista.add(button58);lista.add(button59);lista.add(button60);lista.add(button61);lista.add(button62);lista.add(button63);
        lista.add(button64);lista.add(button65);lista.add(button66);lista.add(button67);lista.add(button68);lista.add(button69);lista.add(button70);lista.add(button71);lista.add(button72);
        lista.add(button73);lista.add(button74);lista.add(button75);lista.add(button76);lista.add(button77);lista.add(button78);lista.add(button79);lista.add(button80);lista.add(button81);

        //textDialog = (TextView) findViewById(R.id.textDialog);
        //radioButton1.setVisibility(View.GONE);
        final int velicinaFonta = 14;

        buttReset = (Button)findViewById(R.id.buttReset);
        buttReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =0; i <lista.size(); i++){  // ovdfe se mora pre novog napisivanja preko buttona prvo obrisati sve sa buttona
                    lista.get(i).setText("");
                    if(niz1[i]!=0){
                        lista.get(i).setText(String.valueOf(niz1[i]));
                    }
                }
                //Log.e("myApp", Arrays.toString(niz1));
            }
        });

        buttNewGame = (Button)findViewById(R.id.buttNewGame);
        buttNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finish();
                for(int i =0; i <lista.size(); i++){  // ovdfe se mora pre novog napisivanja preko buttona prvo obrisati sve sa buttona
                    lista.get(i).setText("");
                    lista.get(i).setClickable(true);
                }
                lista2 = new ArrayList<>();
                new SimpleSyncTask().execute();
            }
        });

        for(int i =0; i <lista.size(); i++){  // ovdfe se mora pre novog napisivanja preko buttona prvo obrisati sve sa buttona
            lista.get(i).setText("");
            lista.get(i).setClickable(true);
        }
        lista2 = new ArrayList<>();
        new SimpleSyncTask().execute();



        /*if(flag2){
            new SimpleSyncTask().execute();
            flag2 = false;
        }*/

        //niz5 = totaleNiz;


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button1)){
                    if(brojUnosa == 0){
                        button1.setText("");
                    }else{
                        button1.setText(unoss);
                        button1.setTextSize(velicinaFonta);
                        button1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));


                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU




                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button2)){
                    if(brojUnosa == 0){
                        button2.setText("");
                    }else{
                        button2.setText(unoss);
                        button2.setTextSize(velicinaFonta);
                        button2.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button3)){
                    if(brojUnosa == 0){
                        button3.setText("");
                    }else{
                        button3.setText(unoss);
                        button3.setTextSize(velicinaFonta);
                        button3.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button4)){
                    if(brojUnosa == 0){
                        button4.setText("");
                    }else{
                        button4.setText(unoss);
                        button4.setTextSize(velicinaFonta);
                        button4.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button5)){
                    if(brojUnosa == 0){
                        button5.setText("");
                    }else{
                        button5.setText(unoss);
                        button5.setTextSize(velicinaFonta);
                        button5.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button6)){
                    if(brojUnosa == 0){
                        button6.setText("");
                    }else{
                        button6.setText(unoss);
                        button6.setTextSize(velicinaFonta);
                        button6.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button7)){
                    if(brojUnosa == 0){
                        button7.setText("");
                    }else{
                        button7.setText(unoss);
                        button7.setTextSize(velicinaFonta);
                        button7.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button8)){
                    if(brojUnosa == 0){
                        button8.setText("");
                    }else{
                        button8.setText(unoss);
                        button8.setTextSize(velicinaFonta);
                        button8.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button9)){
                    if(brojUnosa == 0){
                        button9.setText("");
                    }else{
                        button9.setText(unoss);
                        button9.setTextSize(velicinaFonta);
                        button9.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button10)){
                    if(brojUnosa == 0){
                        button10.setText("");
                    }else{
                        button10.setText(unoss);
                        button10.setTextSize(velicinaFonta);
                        button10.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button11)){
                    if(brojUnosa == 0){
                        button11.setText("");
                    }else{
                        button11.setText(unoss);
                        button11.setTextSize(velicinaFonta);
                        button11.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button12)){
                    if(brojUnosa == 0){
                        button12.setText("");
                    }else{
                        button12.setText(unoss);
                        button12.setTextSize(velicinaFonta);
                        button12.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button13)){
                    if(brojUnosa == 0){
                        button13.setText("");
                    }else{
                        button13.setText(unoss);
                        button13.setTextSize(velicinaFonta);
                        button13.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button14)){
                    if(brojUnosa == 0){
                        button14.setText("");
                    }else{
                        button14.setText(unoss);
                        button14.setTextSize(velicinaFonta);
                        button14.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button15)){
                    if(brojUnosa == 0){
                        button15.setText("");
                    }else{
                        button15.setText(unoss);
                        button15.setTextSize(velicinaFonta);
                        button15.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button16)){
                    if(brojUnosa == 0){
                        button16.setText("");
                    }else{
                        button16.setText(unoss);
                        button16.setTextSize(velicinaFonta);
                        button16.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button17)){
                    if(brojUnosa == 0){
                        button17.setText("");
                    }else{
                        button17.setText(unoss);
                        button17.setTextSize(velicinaFonta);
                        button17.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button18)){
                    if(brojUnosa == 0){
                        button18.setText("");
                    }else{
                        button18.setText(unoss);
                        button18.setTextSize(velicinaFonta);
                        button18.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button19)){
                    if(brojUnosa == 0){
                        button19.setText("");
                    }else{
                        button19.setText(unoss);
                        button19.setTextSize(velicinaFonta);
                        button19.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button20)){
                    if(brojUnosa == 0){
                        button20.setText("");
                    }else{
                        button20.setText(unoss);
                        button20.setTextSize(velicinaFonta);
                        button20.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button21)){
                    if(brojUnosa == 0){
                        button21.setText("");
                    }else{
                        button21.setText(unoss);
                        button21.setTextSize(velicinaFonta);
                        button21.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button22)){
                    if(brojUnosa == 0){
                        button22.setText("");
                    }else{
                        button22.setText(unoss);
                        button22.setTextSize(velicinaFonta);
                        button22.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button23)){
                    if(brojUnosa == 0){
                        button23.setText("");
                    }else{
                        button23.setText(unoss);
                        button23.setTextSize(velicinaFonta);
                        button23.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button24)){
                    if(brojUnosa == 0){
                        button24.setText("");
                    }else{
                        button24.setText(unoss);
                        button24.setTextSize(velicinaFonta);
                        button24.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button25)){
                    if(brojUnosa == 0){
                        button25.setText("");
                    }else{
                        button25.setText(unoss);
                        button25.setTextSize(velicinaFonta);
                        button25.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button26)){
                    if(brojUnosa == 0){
                        button26.setText("");
                    }else{
                        button26.setText(unoss);
                        button26.setTextSize(velicinaFonta);
                        button26.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button27)){
                    if(brojUnosa == 0){
                        button27.setText("");
                    }else{
                        button27.setText(unoss);
                        button27.setTextSize(velicinaFonta);
                        button27.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button28)){
                    if(brojUnosa == 0){
                        button28.setText("");
                    }else{
                        button28.setText(unoss);
                        button28.setTextSize(velicinaFonta);
                        button28.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button29)){
                    if(brojUnosa == 0){
                        button29.setText("");
                    }else{
                        button29.setText(unoss);
                        button29.setTextSize(velicinaFonta);
                        button29.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button30)){
                    if(brojUnosa == 0){
                        button30.setText("");
                    }else{
                        button30.setText(unoss);
                        button30.setTextSize(velicinaFonta);
                        button30.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button31)){
                    if(brojUnosa == 0){
                        button31.setText("");
                    }else{
                        button31.setText(unoss);
                        button31.setTextSize(velicinaFonta);
                        button31.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button32)){
                    if(brojUnosa == 0){
                        button32.setText("");
                    }else{
                        button32.setText(unoss);
                        button32.setTextSize(velicinaFonta);
                        button32.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button33)){
                    if(brojUnosa == 0){
                        button33.setText("");
                    }else{
                        button33.setText(unoss);
                        button33.setTextSize(velicinaFonta);
                        button33.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button34)){
                    if(brojUnosa == 0){
                        button34.setText("");
                    }else{
                        button34.setText(unoss);
                        button34.setTextSize(velicinaFonta);
                        button34.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button35)){
                    if(brojUnosa == 0){
                        button35.setText("");
                    }else{
                        button35.setText(unoss);
                        button35.setTextSize(velicinaFonta);
                        button35.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button36)){
                    if(brojUnosa == 0){
                        button36.setText("");
                    }else{
                        button36.setText(unoss);
                        button36.setTextSize(velicinaFonta);
                        button36.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button37)){
                    if(brojUnosa == 0){
                        button37.setText("");
                    }else{
                        button37.setText(unoss);
                        button37.setTextSize(velicinaFonta);
                        button37.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button38)){
                    if(brojUnosa == 0){
                        button38.setText("");
                    }else{
                        button38.setText(unoss);
                        button38.setTextSize(velicinaFonta);
                        button38.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button39)){
                    if(brojUnosa == 0){
                        button39.setText("");
                    }else{
                        button39.setText(unoss);
                        button39.setTextSize(velicinaFonta);
                        button39.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button40)){
                    if(brojUnosa == 0){
                        button40.setText("");
                    }else{
                        button40.setText(unoss);
                        button40.setTextSize(velicinaFonta);
                        button40.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button41)){
                    if(brojUnosa == 0){
                        button41.setText("");
                    }else{
                        button41.setText(unoss);
                        button41.setTextSize(velicinaFonta);
                        button41.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button42)){
                    if(brojUnosa == 0){
                        button42.setText("");
                    }else{
                        button42.setText(unoss);
                        button42.setTextSize(velicinaFonta);
                        button42.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button43)){
                    if(brojUnosa == 0){
                        button43.setText("");
                    }else{
                        button43.setText(unoss);
                        button43.setTextSize(velicinaFonta);
                        button43.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button44)){
                    if(brojUnosa == 0){
                        button44.setText("");
                    }else{
                        button44.setText(unoss);
                        button44.setTextSize(velicinaFonta);
                        button44.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button45)){
                    if(brojUnosa == 0){
                        button45.setText("");
                    }else{
                        button45.setText(unoss);
                        button45.setTextSize(velicinaFonta);
                        button45.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button46)){
                    if(brojUnosa == 0){
                        button46.setText("");
                    }else{
                        button46.setText(unoss);
                        button46.setTextSize(velicinaFonta);
                        button46.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button47)){
                    if(brojUnosa == 0){
                        button47.setText("");
                    }else{
                        button47.setText(unoss);
                        button47.setTextSize(velicinaFonta);
                        button47.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button48)){
                    if(brojUnosa == 0){
                        button48.setText("");
                    }else{
                        button48.setText(unoss);
                        button48.setTextSize(velicinaFonta);
                        button48.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button49)){
                    if(brojUnosa == 0){
                        button49.setText("");
                    }else{
                        button49.setText(unoss);
                        button49.setTextSize(velicinaFonta);
                        button49.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button50)){
                    if(brojUnosa == 0){
                        button50.setText("");
                    }else{
                        button50.setText(unoss);
                        button50.setTextSize(velicinaFonta);
                        button50.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button51)){
                    if(brojUnosa == 0){
                        button51.setText("");
                    }else{
                        button51.setText(unoss);
                        button51.setTextSize(velicinaFonta);
                        button51.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button52)){
                    if(brojUnosa == 0){
                        button52.setText("");
                    }else{
                        button52.setText(unoss);
                        button52.setTextSize(velicinaFonta);
                        button52.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button53)){
                    if(brojUnosa == 0){
                        button53.setText("");
                    }else{
                        button53.setText(unoss);
                        button53.setTextSize(velicinaFonta);
                        button53.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button54)){
                    if(brojUnosa == 0){
                        button54.setText("");
                    }else{
                        button54.setText(unoss);
                        button54.setTextSize(velicinaFonta);
                        button54.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button55)){
                    if(brojUnosa == 0){
                        button55.setText("");
                    }else{
                        button55.setText(unoss);
                        button55.setTextSize(velicinaFonta);
                        button55.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button56)){
                    if(brojUnosa == 0){
                        button56.setText("");
                    }else{
                        button56.setText(unoss);
                        button56.setTextSize(velicinaFonta);
                        button56.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button57)){
                    if(brojUnosa == 0){
                        button57.setText("");
                    }else{
                        button57.setText(unoss);
                        button57.setTextSize(velicinaFonta);
                        button57.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button58)){
                    if(brojUnosa == 0){
                        button58.setText("");
                    }else{
                        button58.setText(unoss);
                        button58.setTextSize(velicinaFonta);
                        button58.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button59)){
                    if(brojUnosa == 0){
                        button59.setText("");
                    }else{
                        button59.setText(unoss);
                        button59.setTextSize(velicinaFonta);
                        button59.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button60)){
                    if(brojUnosa == 0){
                        button60.setText("");
                    }else{
                        button60.setText(unoss);
                        button60.setTextSize(velicinaFonta);
                        button60.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button61)){
                    if(brojUnosa == 0){
                        button61.setText("");
                    }else{
                        button61.setText(unoss);
                        button61.setTextSize(velicinaFonta);
                        button61.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button62)){
                    if(brojUnosa == 0){
                        button62.setText("");
                    }else{
                        button62.setText(unoss);
                        button62.setTextSize(velicinaFonta);
                        button62.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button63)){
                    if(brojUnosa == 0){
                        button63.setText("");
                    }else{
                        button63.setText(unoss);
                        button63.setTextSize(velicinaFonta);
                        button63.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button64)){
                    if(brojUnosa == 0){
                        button64.setText("");
                    }else{
                        button64.setText(unoss);
                        button64.setTextSize(velicinaFonta);
                        button64.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button65)){
                    if(brojUnosa == 0){
                        button65.setText("");
                    }else{
                        button65.setText(unoss);
                        button65.setTextSize(velicinaFonta);
                        button65.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button66)){
                    if(brojUnosa == 0){
                        button66.setText("");
                    }else{
                        button66.setText(unoss);
                        button66.setTextSize(velicinaFonta);
                        button66.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button67)){
                    if(brojUnosa == 0){
                        button67.setText("");
                    }else{
                        button67.setText(unoss);
                        button67.setTextSize(velicinaFonta);
                        button67.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button68)){
                    if(brojUnosa == 0){
                        button68.setText("");
                    }else{
                        button68.setText(unoss);
                        button68.setTextSize(velicinaFonta);
                        button68.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button69)){
                    if(brojUnosa == 0){
                        button69.setText("");
                    }else{
                        button69.setText(unoss);
                        button69.setTextSize(velicinaFonta);
                        button69.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button70)){
                    if(brojUnosa == 0){
                        button70.setText("");
                    }else{
                        button70.setText(unoss);
                        button70.setTextSize(velicinaFonta);
                        button70.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button71)){
                    if(brojUnosa == 0){
                        button71.setText("");
                    }else{
                        button71.setText(unoss);
                        button71.setTextSize(velicinaFonta);
                        button71.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button72)){
                    if(brojUnosa == 0){
                        button72.setText("");
                    }else{
                        button72.setText(unoss);
                        button72.setTextSize(velicinaFonta);
                        button72.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button73)){
                    if(brojUnosa == 0){
                        button73.setText("");
                    }else{
                        button73.setText(unoss);
                        button73.setTextSize(velicinaFonta);
                        button73.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button74)){
                    if(brojUnosa == 0){
                        button74.setText("");
                    }else{
                        button74.setText(unoss);
                        button74.setTextSize(velicinaFonta);
                        button74.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button75)){
                    if(brojUnosa == 0){
                        button75.setText("");
                    }else{
                        button75.setText(unoss);
                        button75.setTextSize(velicinaFonta);
                        button75.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button76)){
                    if(brojUnosa == 0){
                        button76.setText("");
                    }else{
                        button76.setText(unoss);
                        button76.setTextSize(velicinaFonta);
                        button76.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button77)){
                    if(brojUnosa == 0){
                        button77.setText("");
                    }else{
                        button77.setText(unoss);
                        button77.setTextSize(velicinaFonta);
                        button77.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button78)){
                    if(brojUnosa == 0){
                        button78.setText("");
                    }else{
                        button78.setText(unoss);
                        button78.setTextSize(velicinaFonta);
                        button78.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button79)){
                    if(brojUnosa == 0){
                        button79.setText("");
                    }else{
                        button79.setText(unoss);
                        button79.setTextSize(velicinaFonta);
                        button79.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button80)){
                    if(brojUnosa == 0){
                        button80.setText("");
                    }else{
                        button80.setText(unoss);
                        button80.setTextSize(velicinaFonta);
                        button80.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!lista2.contains(button81)){
                    if(brojUnosa == 0){
                        button81.setText("");
                    }else{
                        button81.setText(unoss);
                        button81.setTextSize(velicinaFonta);
                        button81.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                        //PROVERA DALI JE RESEN SUDOKU
                        proveraRezultata();
                        //PROVERA DALI JE RESEN SUDOKU
                    }
                }
            }
        });





    }
 /*   @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String[]nizTabele = new String[81];
        for(int i = 0; i<nizTabele.length; i++){
            nizTabele[i]= (String) lista.get(i).getText();
        }
        outState.putStringArray("prenos", nizTabele);
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        String[]nizTabele = saveInstanceState.getStringArray("prenos");
        if(saveInstanceState != null){
            for(int i = 0; i<nizTabele.length; i++){
                lista.get(i).setText(nizTabele[i]);
                lista.get(i).setTextSize(24);
                lista.get(i).setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
        }

    }*/




    @Override
    protected void onStart() {
        super.onStart();
            /*new SimpleSyncTask().execute();*/

    }

    public void rbclick(View v){
        int radioButton = radioGroup.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(radioButton);
        unoss = (String) radioButton1.getText();
        if(unoss.length()>2){
            brojUnosa = 0;
        }else{
            brojUnosa = Integer.parseInt(unoss);
        }
        //Toast.makeText(getApplicationContext(),String.valueOf(brojUnosa),Toast.LENGTH_LONG).show();
    }

    public void proveraRezultata(){
        //PROVERA DALI JE RESEN SUDOKU
        flagBRE = true;
        for(int i = 0; i<niz3.length; i++){
            if(lista.get(i).getText().equals("")){
                niz3[i] = 10;
            }else{
                niz3[i] = Integer.parseInt((String) lista.get(i).getText());
            }
        }
        for(int i = 0; i<niz3.length; i++){
            if(niz3[i] != niz5[i]){
                flagBRE = false;
                break;
            }
        }

        if(flagBRE){


            final Dialog dialog = new Dialog(this);// add here your class name
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_layout);//add your own xml with defied with and height of videoview
            dialog.show();
            String uriPath= "android.resource://" + getPackageName() + "/" + R.raw.rek0;
            final VideoView videoview = (VideoView) dialog.findViewById(R.id.videoView);
            videoview.setVideoURI(Uri.parse(uriPath));
            videoview.start();
            videoview.setZOrderOnTop(true);


            videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
                }
            });

            Button button = (Button) dialog.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });




        }
        //PROVERA DALI JE RESEN SUDOKU
    }


    //OVDE POCINJE NOVA KLASA ASYNC TASK-A ---------------------------------------------------------------------
    public class SimpleSyncTask extends AsyncTask<String, String, String> {

        public SimpleSyncTask() {

        }

        @Override
        protected void onPostExecute(String s) {

            for(int i = 0; i<niz1.length; i++){
                if(niz1[i]!=0){
                    lista.get(i).setText(String.valueOf(niz1[i]));
                    lista.get(i).setClickable(false);
                    lista.get(i).setTextSize(18);
                    lista.get(i).setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));  //Kod za boldovanje texta
                    lista2.add(lista.get(i));
                }
            }
            progressDialo.dismiss();

        }
        @Override
        protected String doInBackground(String... params) {

            String finalni = String.valueOf(getIntent().getExtras().getInt("Procenat"));
            putINTENT = finalni;

            niz1 = generisanjeNizaSudoku();
            //niz5 = niz1;
            procenatKolikoFaliUTabeli = Integer.parseInt(finalni);
            niz1 = generisanjeNizaSudokusaIzuzetim();
            flagg = false;
            brojac43 = 0;

            return finalni;
        }

        @Override
        protected  void onPreExecute()
        {
            progressDialo = ProgressDialog.show(Tabela.this,
                    getResources().getString(R.string.Kreiranje_tabele_u_toku),  getResources().getString(R.string.Molimo_sacekajte));
        }


    }
}
