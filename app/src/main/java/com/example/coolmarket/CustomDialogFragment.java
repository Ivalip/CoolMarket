package com.example.coolmarket;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustomDialogFragment extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Bundle b = getArguments();
        return builder
                .setTitle("Детали заказа:")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Ваш заказ:")
                .setMessage(b.getString("Arguments"))
                .setPositiveButton("OK", null)
                .setNegativeButton("Назад", null)
                .create();
    }
}
