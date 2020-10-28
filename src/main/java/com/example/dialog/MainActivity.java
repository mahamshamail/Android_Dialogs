package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView useNameTXT ;
    private TextView passwordTXT ;
    private TextView dateTXT ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         useNameTXT = (TextView)findViewById(R.id.text);
         passwordTXT = (TextView)findViewById(R.id.text2);
         dateTXT = (TextView)findViewById(R.id.date);

    }
    public void alertDialog(View v){
        DeleteUserFragment deleteDialog = new DeleteUserFragment();
        deleteDialog.show(getSupportFragmentManager(), "delete user");
    }
    public void customDialog(View v){
        Login login = new Login();
        login.show(getSupportFragmentManager(),"this is the tag");
    }
    public void dateDialog(View v){
            DateDialogue dateDialogue = new DateDialogue();
            dateDialogue.show(getSupportFragmentManager(),"this is a tag");

    }

    public TextView getUseNameTXT() {
        return useNameTXT;
    }

    public TextView getPasswordTXT() {
        return passwordTXT;
    }

    public TextView getDateTXT() { return dateTXT; }



}