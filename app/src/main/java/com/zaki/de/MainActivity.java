    package com.zaki.de;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.CompoundButton;
    import android.widget.EditText;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.Switch;
    import android.widget.TextView;
    import android.widget.Toast;

    import com.example.de.R;
    import com.google.android.material.floatingactionbutton.FloatingActionButton;

    public class MainActivity extends AppCompatActivity {

        Button HADD;
        Button FADD;
        Button SUBMIT;
        EditText ABIT;
        EditText BBIT;
        FloatingActionButton devinfo;
        EditText CBIT;
        TextView ANS;
        TextView carry;
        RadioButton HALFADDER;
        RadioButton FULLADDER;
        RadioGroup OPERATOR;
       //Switch CHOOSE;
        int a ;
        int b;
        int c;
        int hsum;
        int hcarry;
        int fsum;
        int fcarry;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
           // HADD = findViewById(R.id.HADD);
            //FADD = findViewById(R.id.FADD);
            ANS = findViewById(R.id.ANS);
            ABIT = findViewById(R.id.ABIT);
            BBIT = findViewById(R.id.BBIT);
            CBIT = findViewById(R.id.CBIT);
            carry = findViewById(R.id.carry);
            //CHOOSE = findViewById(R.id.CHOOSE);
            SUBMIT = findViewById(R.id.SUBMIT);
            HALFADDER =findViewById(R.id.HALFADDER);
            FULLADDER =findViewById(R.id.FULLADDER);
            OPERATOR = findViewById(R.id.OPERATOR);
            devinfo = findViewById(R.id.devinfo);

            /*if(HALFADDER.isChecked()){
                ABIT.setVisibility(View.VISIBLE);
                BBIT.setVisibility(View.VISIBLE);
                CBIT.setVisibility(View.INVISIBLE);
            }else if(FULLADDER.isChecked()) {
                ABIT.setVisibility(View.VISIBLE);
                BBIT.setVisibility(View.VISIBLE);
                CBIT.setVisibility(View.VISIBLE);
            }*/

            // MAIN EVENT
            OPERATOR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if (HALFADDER.isChecked()) {
                        ABIT.setVisibility(View.VISIBLE);
                        BBIT.setVisibility(View.VISIBLE);
                        CBIT.setVisibility(View.INVISIBLE); // or View.GONE if needed

                        SUBMIT.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(ABIT.getText().toString().equals("")){
                                    Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
                                }else {
                                    a = Integer.parseInt(ABIT.getText().toString());
                                }
                                if(BBIT.getText().toString().equals("")){
                                    Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                                }else {
                                    b = Integer.parseInt(BBIT.getText().toString());
                                }
                                hsum = Hsum(a , b);
                                ANS.setText("sum is" + " " +  + hsum);
                                hcarry=Hcarry(a,b);
                                carry.setText("carry is" + " " + + hcarry);
                            }
                        });




                    } else if (FULLADDER.isChecked()) {
                        ABIT.setVisibility(View.VISIBLE);
                        BBIT.setVisibility(View.VISIBLE);
                        CBIT.setVisibility(View.VISIBLE);

                        SUBMIT.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(ABIT.getText().toString().equals("")){
                                    Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
                                }else {
                                    a = Integer.parseInt(ABIT.getText().toString());
                                }

                                if(BBIT.getText().toString().equals("")){
                                    Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                                }else {
                                    b = Integer.parseInt(BBIT.getText().toString());
                                }
                                if(CBIT.getText().toString().equals("")) {
                                    Toast.makeText(MainActivity.this, "ENTER C BIT VALUE", Toast.LENGTH_SHORT).show();
                                }else {
                                    c = Integer.parseInt(CBIT.getText().toString());
                                }
                                fsum =  Fsum(a,b,c);
                                ANS.setText("SUM IS " + " " + fsum);
                                fcarry =Fcarry(a,b,c);
                                carry.setText("carry is" + " " + fcarry);

                            }
                        });

                    }

                }
            });




           /* HADD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                if(ABIT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
                }else {
                   a = Integer.parseInt(ABIT.getText().toString());
                }
                    if(BBIT.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                    }else {
                        b = Integer.parseInt(BBIT.getText().toString());
                    }
                    hsum = Hsum(a , b);
                    ANS.setText("sum is" + " " +  + hsum);
                    hcarry=Hcarry(a,b);
                    carry.setText("carry is" + " " + + hcarry);


                }
            });*/

            /*FADD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(ABIT.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
                    }else {
                        a = Integer.parseInt(ABIT.getText().toString());
                    }

                    if(BBIT.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                    }else {
                        b = Integer.parseInt(BBIT.getText().toString());
                    }
                    if(CBIT.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "ENTER C BIT VALUE", Toast.LENGTH_SHORT).show();
                    }else {
                        c = Integer.parseInt(CBIT.getText().toString());
                    }
                    fsum =  Fsum(a,b,c);
                    ANS.setText("SUM IS " + " " + fsum);
                    fcarry =Fcarry(a,b,c);
                    carry.setText("carry is" + " " + fcarry);




                }
            });*/


           /* CHOOSE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean ischecked) {
                   //Toast.makeText(MainActivity.this, "FULL ADDER FUCNTION", Toast.LENGTH_SHORT).show();{
                        if (ischecked) {
                            // The switch is checked. put full adder fucntions here
                        } else {
                            // The switch isn't checked. put half adder fucntion here
                        }
                }
            });*/




        }
        //FUCNTIONS
        public int Fsum(int x , int y , int z) {
            int hs;
         hs = Hsum(x,y);
         int t;
         if(hs ==z){
             t =hs;

         }else {
             t = -1;
         }
         if(t ==1 || t==0) {
             return 0;
         }
         else {
             return 1;
         }



           // return 0;
        }

        public int Fcarry(int x , int y , int z) {

            int hss = z * Hsum(x,y);
            int hcc =   Hcarry(x,y) ;
            if ( hss==1 || hcc ==1) {
                return 1;
            }
            else {
                return 0;
            }

            //return 0;
        }

        public int  Hsum(int x , int y) {
            int z;
            if ( x == y  ) {
                 z = x;
            } else {
                z = -1;
            }
            if (z ==1 || z==0) {
                return 0;
            } else {
                return 1;
            }
            //return 0;
        }

        public  int Hcarry(int x , int y) {
            int z ;
            if(x==y) {
                z =x;
            }else {
                z = -1;
            }

            if ( z==1 ) {
                return 1;
            }else{
                return 0;
            }
            //return 0;
        }

        public void open(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mohammed-zaki-0933b5284/"));
            startActivity(browserIntent);

        }
    }