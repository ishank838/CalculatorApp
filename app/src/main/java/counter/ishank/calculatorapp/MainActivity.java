package counter.ishank.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static Button button_0;
    private static Button button_1;
    private static Button button_2;
    private static Button button_3;
    private static Button button_4;
    private static Button button_5;
    private static Button button_6;
    private static Button button_7;
    private static Button button_8;
    private static Button button_9;

    private static Button button_c;
    private static Button button_add;
    private static Button button_div;
    private static Button button_mul;
    private static Button button_sub;
    private static Button button_equal;

    private static boolean add_flag=false;
    private static boolean sub_flag=false;
    private static boolean mul_flag=false;
    private static boolean div_flag=false;
    private static boolean equal_flag=false;

    private static int lastval;
    private static int currval;


    private TextView editText;

    public void updateResults()
    {
        if(add_flag)
        {
            lastval=lastval+currval;
            add_flag=false;
        }
        else if(sub_flag)
        {
            lastval=lastval-currval;
            sub_flag=false;
        }
        else if(mul_flag)
        {
            lastval=lastval*currval;
            mul_flag=false;
        }
        else if(div_flag)
        {
            if(currval!=0)
            {
                lastval=lastval/currval;
                div_flag=false;
            }
        }
        equal_flag=true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = findViewById(R.id.btn_0);
        button_1 = findViewById(R.id.btn_1);
        button_2 = findViewById(R.id.btn_2);
        button_3 = findViewById(R.id.btn_3);
        button_4 = findViewById(R.id.btn_4);
        button_5 = findViewById(R.id.btn_5);
        button_6 = findViewById(R.id.btn_6);
        button_7 = findViewById(R.id.btn_7);
        button_8 = findViewById(R.id.btn_8);
        button_9 = findViewById(R.id.btn_9);

        button_c=findViewById(R.id.btn_clear);
        button_add=findViewById(R.id.btn_add);
        button_sub=findViewById(R.id.btn_subtract);
        button_mul=findViewById(R.id.btn_product);
        button_div=findViewById(R.id.btn_divide);
        button_equal=findViewById(R.id.btn_equals);

        editText = findViewById(R.id.edit_text);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("0");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "0");
                }
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("1");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "1");
                }
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("2");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "2");
                }
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("3");
                    equal_flag=false;

                }
                else {
                    editText.setText(editText.getText() + "3");
                }
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("4");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "4");
                }
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("5");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "5");
                }
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("6");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "6");
                }
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("7");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "7");
                }
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("8");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "8");
                }
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()=="0" || equal_flag)
                {
                    editText.setText("9");
                    equal_flag=false;
                }
                else {
                    editText.setText(editText.getText() + "9");
                }
            }
        });



        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("0");
                lastval=0;
                currval=0;
                add_flag=false;
                div_flag=false;
                mul_flag=false;
                sub_flag=false;
                equal_flag=false;
            }
        });


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currval=Integer.valueOf(editText.getText().toString());
                if(equal_flag)
                {
                    equal_flag=false;
                }
                if(div_flag || mul_flag || sub_flag)
                {
                    updateResults();
                    add_flag=true;
                    editText.setText("0");
                }
                else if(add_flag)
                {
                    int res=currval+lastval;
                    lastval=res;
                    editText.setText(Integer.toString(res));
                    equal_flag=true;
                }
                else
                {
                    lastval=currval;
                    add_flag=true;
                    editText.setText("0");
                }

            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currval=Integer.valueOf(editText.getText().toString());
                if(equal_flag)
                {
                    equal_flag=false;
                }
                if(add_flag || mul_flag || div_flag)
                {
                    updateResults();
                    sub_flag=true;
                    editText.setText("0");
                }
                else if(sub_flag)
                {
                    equal_flag=true;
                    int res=lastval-currval;
                    lastval=res;
                    editText.setText(Integer.toString(res));
                }
                else
                {
                    lastval=currval;
                    sub_flag=true;
                    editText.setText("0");
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currval=Integer.valueOf(editText.getText().toString());
                if(equal_flag)
                {
                    equal_flag=false;
                }
                if(add_flag || div_flag || sub_flag)
                {
                    updateResults();
                    mul_flag=true;
                    editText.setText("0");
                }
                else if(mul_flag)
                {
                    equal_flag=true;
                    int res=currval*lastval;
                    lastval=res;
                    editText.setText(Integer.toString(res));
                }
                else
                {
                    lastval=currval;
                    mul_flag=true;
                    editText.setText("0");
                }

            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currval=Integer.valueOf(editText.getText().toString());
                if(equal_flag)
                {
                    equal_flag=false;
                }
                if(add_flag || mul_flag || sub_flag)
                {
                    updateResults();
                    div_flag=true;
                    editText.setText("0");
                }
                else if(div_flag)
                {
                    if(currval!=0) {
                        equal_flag = true;
                        int res = lastval/currval;
                        lastval=res;
                        editText.setText(Integer.toString(res));
                    }
                    else
                    {
                      //
                    }
                }
                else
                {
                    lastval=currval;
                    div_flag=true;
                    editText.setText("0");
                }
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currval=Integer.parseInt(editText.getText().toString());
                if(add_flag)
                {
                    add_flag=false;
                    int res=currval+lastval;
                    lastval=res;
                    equal_flag=true;
                    editText.setText(Integer.toString(res));
                }
                else if(sub_flag)
                {
                    sub_flag=false;
                    int res=lastval-currval;
                    lastval=res;
                    equal_flag=true;
                    editText.setText(Integer.toString(res));
                }
                else if(mul_flag)
                {
                    mul_flag=false;
                    int res=lastval*currval;
                    lastval=res;
                    equal_flag=true;
                    editText.setText(Integer.toString(res));
                }
                else if(div_flag)
                {
                    if(currval!=0)
                    {
                        sub_flag = false;
                        int res = lastval / currval;
                        equal_flag=true;
                        editText.setText(Integer.toString(res));
                    }
                }
            }
        });
    }
}
