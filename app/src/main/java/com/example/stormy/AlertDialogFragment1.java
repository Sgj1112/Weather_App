package com.example.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

public class AlertDialogFragment1 extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder  = new AlertDialog.Builder(context);
        builder.setTitle("Internet Error")
                .setMessage("Please switch on internet")
                .setPositiveButton("OK",null);

        return builder.create();
    }
}
