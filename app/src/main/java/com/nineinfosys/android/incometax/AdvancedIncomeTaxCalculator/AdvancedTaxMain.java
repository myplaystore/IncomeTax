package com.nineinfosys.android.incometax.AdvancedIncomeTaxCalculator;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.android.incometax.MainActivityDrawer;
import com.nineinfosys.android.incometax.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AdvancedTaxMain extends Fragment {

    TextView first,second,third,fourth,fivth,firstI,secondI,thirdI,fourthI,fivthI;
    Spinner  genderspinner;
    AdvancedTax income;
    EditText incometaxsalary,housingloan,selfoccupied,letablevalue,municipaltaxes,unrealizedrent,netincome,standarddeduction,letout,
            interestonhousing1,totalhousedittextid, shortterm1,shortterm2,lonterm1,longterm2,totalcapitalgain,interest,commision,lotery,
            totalothersources,reliefedittext, surchargeedittext, educationedittext, higherandseceducationcessedittext, totalreliefedittext,totalnet,amountofint;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_advanced_tax_main, null);
        ((MainActivityDrawer) getActivity()).toolbar.setTitle("Advanced Income Tax Calculator");

        MobileAds.initialize(getActivity(), getString(R.string.ads_app_id));
        AdView mAdView = (AdView) v.findViewById(R.id.adViewAdvanceTax);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView mAdView1 = (AdView) v.findViewById(R.id.adViewAdvTax);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);

        AdView mAdView2 = (AdView) v.findViewById(R.id.adViewAdvanceMain);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

        DecimalFormat f = new DecimalFormat("##.00");
        Configuration config = getResources().getConfiguration();
        genderspinner = (Spinner)v. findViewById(R.id.genderspinnerid);
        incometaxsalary=(EditText)v.findViewById(R.id.incometaxedittextid);
        housingloan=(EditText)v.findViewById(R.id.intersetonhousingloanedittextid);
        housingloan.setText("0");
        selfoccupied=(EditText)v.findViewById(R.id.interestonselfoccupiededittext);
        selfoccupied.setEnabled(false);
        Button buttonCalculte = (Button)v. findViewById(R.id.buttoncalculate);
        letablevalue=(EditText)v.findViewById(R.id.annualliablevalueedittextid);
        letablevalue.setText("0");
        municipaltaxes=(EditText)v.findViewById(R.id.muncipaltaxesedittextid);
        municipaltaxes.setText("0");
        unrealizedrent =(EditText)v.findViewById(R.id.unrealizedrentedittextid);
        unrealizedrent.setText("0");
        netincome =(EditText)v.findViewById(R.id.netincomevalueedittextid);
        netincome.setEnabled(false);
        standarddeduction =(EditText)v.findViewById(R.id.standarddeductionedittextid);
        standarddeduction.setEnabled(false);
        interestonhousing1 =(EditText)v.findViewById(R.id.interestonhousingedittextid);
        interestonhousing1.setText("0");
        totalhousedittextid =(EditText)v.findViewById(R.id.totalhousetextid);
        totalhousedittextid.setEnabled(false);
        shortterm1=(EditText)v.findViewById(R.id.shortterm1edittextid);
        shortterm1.setText("0");
        shortterm2=(EditText)v.findViewById(R.id.shortterm2edittextid);
        shortterm2.setText("0");
        lonterm1=(EditText)v.findViewById(R.id.longterm1edittextid123);
        lonterm1.setText("0");
        longterm2=(EditText)v.findViewById(R.id.longterm2edittextid);
        longterm2.setText("0");
        totalcapitalgain=(EditText)v.findViewById(R.id.totalcapitalgainedittextid);
        totalcapitalgain.setEnabled(false);
        interest=(EditText)v.findViewById(R.id.interestedittextid);
        interest.setText("0");
        commision=(EditText)v.findViewById(R.id.Commissionedittextid);
        commision.setText("0");
        lotery= (EditText)v.findViewById(R.id.Lotteryedittextid);
        lotery.setText("0");
        totalothersources=(EditText)v.findViewById(R.id.totalotheredittextid);
        totalothersources.setEnabled(false);
        reliefedittext = (EditText) v.findViewById(R.id.incometaxreliefedittextid);
        reliefedittext.setEnabled(false);
        surchargeedittext = (EditText)v. findViewById(R.id.surchargeedittextid123);
        surchargeedittext.setEnabled(false);
        educationedittext = (EditText) v.findViewById(R.id.educationcessedittextid);
        educationedittext.setEnabled(false);
        higherandseceducationcessedittext = (EditText)v. findViewById(R.id.higherandseceducessedittextid);
        higherandseceducationcessedittext.setEnabled(false);
        totalreliefedittext = (EditText)v. findViewById(R.id.totalreliefedittextid);
        totalreliefedittext.setEnabled(false);
        totalnet=(EditText)v.findViewById(R.id.totalnettaxedittextid);
        totalnet.setEnabled(false);
        letout=(EditText)v.findViewById(R.id.interestfromletoutedittextid);
        letout.setText("0");
        first=(TextView)v.findViewById(R.id.firstedittextid);
        second=(TextView)v.findViewById(R.id.secondedittextid);
        third=(TextView)v.findViewById(R.id.thirdedittextid);
        fourth=(TextView)v.findViewById(R.id.fourthedittextid);
        fivth=(TextView)v.findViewById(R.id.fivthedittext);
        firstI=(TextView)v.findViewById(R.id.firstIedittext);
        secondI=(TextView)v.findViewById(R.id.secondIedittext);
        thirdI=(TextView)v.findViewById(R.id.thirdIedittext);
        fourthI=(TextView)v.findViewById(R.id.fourthiedittextid);
        fivthI=(TextView)v.findViewById(R.id.fivthiedittext);
        Button buttonhelp = (Button) v.findViewById(R.id.advancetaxhelp);

        ArrayList gender = new ArrayList();
        gender.add("Citizen");
        gender.add("seniorCitizen");
        gender.add("SeniorSuperCitizen");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, gender);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderspinner.setAdapter(dataAdapter);


        buttonCalculte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(incometaxsalary.getText().toString().equals("")){
                    incometaxsalary.setError("Enter the Salary");
                } else if(letablevalue.getText().toString().equals("")){
                }else if(municipaltaxes.getText().toString().equals("")){

                }else if(unrealizedrent.getText().toString().equals("")){

                }else if(interestonhousing1.getText().toString().equals("")){

                } else if(shortterm1.getText().toString().equals("")){

                } else if(shortterm2.getText().toString().equals("")){

                } else if(lonterm1.getText().toString().equals("")){

                } else if(longterm2.getText().toString().equals("")){

                }else if(interest.getText().toString().equals("")){

                }else if(commision.getText().toString().equals("")){

                }else if(lotery.getText().toString().equals("")){

                }else if(housingloan.getText().toString().equals("")){

                }else{
                    DecimalFormat f = new DecimalFormat("##.00");
                    Integer salaryincome = Integer.parseInt(incometaxsalary.getText().toString());
                    Integer house = Integer.parseInt(housingloan.getText().toString());
                    Integer letable = Integer.parseInt(letablevalue.getText().toString());
                    Integer municipal = Integer.parseInt(municipaltaxes.getText().toString());
                    Integer unrealized = Integer.parseInt(unrealizedrent.getText().toString());
                    Integer intersthousing = Integer.parseInt(interestonhousing1.getText().toString());
                    Integer short1 = Integer.parseInt(shortterm1.getText().toString());
                    Integer short2 = Integer.parseInt(shortterm2.getText().toString());
                    Integer long1 = Integer.parseInt(lonterm1.getText().toString());
                    Integer long2 = Integer.parseInt(longterm2.getText().toString());
                    Integer interestt = Integer.parseInt(interest.getText().toString());
                    Integer commisionn = Integer.parseInt(commision.getText().toString());
                    Integer loteryy = Integer.parseInt(lotery.getText().toString());
                    int capitalgainvaluetotal = (short1 + short2 + long1 + long2);
                    totalcapitalgain.setText(String.valueOf(capitalgainvaluetotal));
                    selfoccupied.setText(String.valueOf(-(house)));
                    int NAV = (letable - (municipal + unrealized));
                    netincome.setText(String.valueOf(NAV));
                    standarddeduction.setText(String.valueOf(NAV * 30 / 100));
                    int valuetotalhouse = ((-house)+(NAV - ((NAV * 30 / 100) + intersthousing)));
                    int incomeother = interestt + commisionn + loteryy;
                    totalhousedittextid.setText(String.valueOf(valuetotalhouse));
                    totalothersources.setText(String.valueOf(interestt + commisionn + loteryy));
                    totalnet.setText(String.valueOf(salaryincome + valuetotalhouse + capitalgainvaluetotal + incomeother));
                    double nettax = (salaryincome + valuetotalhouse + capitalgainvaluetotal + incomeother);
                    String spinnerGender = genderspinner.getSelectedItem().toString().trim();
                    income = new AdvancedTax(nettax, spinnerGender);
                    double incomerelief = income.calculateIncomeTaxAfterRelief();
                    double surchargeValue = income.calculateSurcharge();
                    double educationalcess = income.calculateIncomeTaxAfterRelief() * 0.02;
                    double highereducationalcess = income.calculateIncomeTaxAfterRelief() * 0.01;
                    reliefedittext.setText(String.valueOf((f.format(incomerelief))));
                    educationedittext.setText(String.valueOf((f.format(educationalcess))));
                    surchargeedittext.setText(String.valueOf((f.format(surchargeValue))));
                    higherandseceducationcessedittext.setText(String.valueOf((f.format(highereducationalcess))));
                    totalreliefedittext.setText(String.valueOf((f.format(incomerelief + educationalcess + highereducationalcess + surchargeValue))));
                    double i= income.uptoJune();
                    first.setText(String.valueOf(f.format(i)));
                    second.setText(String.valueOf(f.format(income.uptoSep())));
                    third.setText(String.valueOf(f.format(income.uptoDec())));
                    fourth.setText(String.valueOf(f.format(income.uptoMarch())));
                    fivth.setText(String.valueOf(f.format(income.uptoMarch())));

                    firstI.setText(String.valueOf(f.format(i)));
                    secondI.setText(String.valueOf(f.format(income.uptoSep()-(income.uptoJune()))));
                    thirdI.setText(String.valueOf(f.format(income.uptoDec()-(income.uptoSep()))));
                    fourthI.setText(String.valueOf(f.format(income.uptoMarch()-(income.uptoDec()))));
                    fivthI.setText(String.valueOf(f.format(income.uptoMarch()-(income.uptoMarch()))));


                }
            }
        });
        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent helpref = new Intent(getActivity(),AdvancedTaxHelp.class);
                startActivity(helpref);
            }
        });
        return  v;

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }


    }


}

