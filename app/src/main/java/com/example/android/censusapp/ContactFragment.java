package com.example.android.censusapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class ContactFragment extends Fragment {

    private Contact contact;
    private EditText contactNameEditText;
    private EditText contactStreetEditText;
    private EditText contactCityEditText;
    private EditText contactPhoneEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contact = new Contact();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragment_contact, container, false);

        contactNameEditText = (EditText) theView.findViewById(R.id.contactNameEditText);
        contactStreetEditText = (EditText) theView.findViewById(R.id.contactStreetEditText);
        contactCityEditText = (EditText) theView.findViewById(R.id.contactCityEditText);
        contactPhoneEditText = (EditText) theView.findViewById(R.id.contactPhoneEditText);


        TextWatcher editTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


                if(contactNameEditText.hasFocus() == true){

                    contact.setName(s.toString());

                } else if(contactStreetEditText.hasFocus() == true){

                    contact.setStreetAddress(s.toString());

                } else if(contactCityEditText.hasFocus() == true){

                    contact.setCity(s.toString());

                } else if(contactPhoneEditText.hasFocus() == true){

                    contact.setPhoneNumber(s.toString());

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        contactNameEditText.addTextChangedListener(editTextWatcher);
        contactStreetEditText.addTextChangedListener(editTextWatcher);
        contactCityEditText.addTextChangedListener(editTextWatcher);
        contactPhoneEditText.addTextChangedListener(editTextWatcher);

        return theView;
    }
}
