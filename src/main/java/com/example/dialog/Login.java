package com.example.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;
//customised dialogs need an inflater object that returns the custom view you want to diskoay
public class Login extends DialogFragment {
    private EditText usernameET;
    private EditText passwordET;

    public Dialog onCreateDialog(Bundle saveInstanceState){
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
       // view.getView().findViewById(R.i)

        View view = inflater.inflate(R.layout.loginscreen, null);
        usernameET = view.findViewById(R.id.EnterUsername);
        passwordET = view.findViewById(R.id.EnterPassword);
        builder.setView(view)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                        String un = usernameET.getText().toString();
                        String pswd = passwordET.getText().toString();
                        //polymorphic behavior allows us access main class stuff

                        //pass data from dialog to the main activity
                        ((MainActivity)getActivity()).getUseNameTXT().setText(un);
                        ((MainActivity)getActivity()).getPasswordTXT().setText(pswd);
                        //now call this dialog from main
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
