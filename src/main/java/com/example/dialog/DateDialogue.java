package com.example.dialog;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DateDialogue extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    private DatePicker datPicker ;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        // view.getView().findViewById(R.i)

        View view = inflater.inflate(R.layout.datepicker, null);
        datPicker = view.findViewById(R.id.datepicker);
        builder.setView(view).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

              //  final Calendar c = Calendar.getInstance();
                 int year = datPicker.getYear();
                 int month = datPicker.getMonth();
                 int day = datPicker.getDayOfMonth();
                ((MainActivity)getActivity()).getDateTXT().setText("Date: "+day+"/ "+month+"/"+year);

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
//


        // Create a new instance of DatePickerDialog and return it
       // return new DatePickerDialog(getActivity(), this, year, month, day);
        return builder.create();
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
    }
}