package com.i.quick_gift;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GiftDetails extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_details);

    }

    protected  void onStart(){
        super.onStart();

        TextView textView = (TextView) findViewById(R.id.detailText);
        TextView price = (TextView) findViewById(R.id.detailLPrice);
        TextView comp = (TextView) findViewById(R.id.detailComp);

        ImageView imageView = (ImageView)findViewById(R.id.detailImage);

        textView.setText(QuickGift.gm.getDescriptionStr());
        price.setText("$" + QuickGift.gm.getPrice() +"\n" + QuickGift.gm.priceStr);
        comp.setText("Compare to \n $" + QuickGift.gm.getMprice() + " - " + QuickGift.gm.getMpStr() + "\n$" + QuickGift.gm.getHprice() + " - " + QuickGift.gm.getHpStr());
        imageView.setImageResource(QuickGift.gm.getImgID());
    }

}