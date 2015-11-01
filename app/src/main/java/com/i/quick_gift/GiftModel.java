package com.i.quick_gift;

/**
 * Created by Travon on 10/31/2015.
 */
public class GiftModel {
    double price;
    double hprice;
    double mprice;
    String priceStr;
    String hpStr;
    String mpStr;

    String descriptionStr;
    int imgID;
    String [] itemName;
    String [] description;
    Double [] amazonPrice;
    Double [] ebayPrice;
    Double [] googlePrice;
    String [] temp;
    String [] temp2;
    Double [] high;
    String [] lowStr;
    Double [] low;
    Double [] temp6;
    Double [] temp7;
    String [] highStr;
    Double [] temp9;
    String [] midStr;
    Double [] mid;
    int [] temp1;
    int [] thumbnail;

    public  GiftModel(){
        instantiateItemName();
        instantiateDescription();
        instantiateAmazonPrice();
        instantiateEbayPrice();
        instantiateGooglePrice();
        instantiateThumbnail();
    }

    public void instantiateItemName(){
        itemName = new String[] {
                "canon6dcamera",
                "christmasmusic",
                "Pots",
                "First Aid",
                "GalaxyS6 Edge",
                "Grill",
                "Headphones",
                "Headphones",
                "IPhone6 Plus",
                "IPhone6 Plus",
                "Iron Gym",
                "Laptop",
                "Love Pillow",
                "Microwave",
                "Music",
                "Pink Hover",
                "PS4",
                "Scooter Skateboard",
                "Smart Watch",
                "Speaker",
                "Speaker",
                "Equipment",
                "Sports Hoop",
                "Tent",
                "Toaster Oven",
                "Water Bottle",
                "Water Bottle",
                "Xbox One",
                "Yellow Hover"
        };
    }

    public void instantiateAmazonPrice(){
        amazonPrice = new Double[] {
                599.95,
                13.99,
                16.99,
                19.29,
                585.38,
                16.99,
                147.99,
                147.99,
                419.00,
                419.00,
                26.43,
                239.99,
                13.50,
                74.00,
                13.99,
                194.50,
                269.99,
                194.50,
                197.99,
                127.20,
                127.20,
                99.99,
                99.00,
                117.50,
                24.97,
                12.99,
                12.99,
                324.95,
                194.50
        };
    }

    public void instantiateEbayPrice(){
        ebayPrice = new Double[] {
                389.99,
                3.09,
                50.97,
                38.99,
                599.99,
                29.97,
                77.00,
                77.00,
                459.00,
                459.00,
                39.99,
                239.99,
                24.95,
                86.99,
                3.09,
                181.99,
                319.89,
                181.99,
                179.99,
                72.00,
                72.00,
                129.99,
                35.39,
                119.99,
                34.32,
                3.28,
                3.29,
                248.99,
                181.99
        };
    }

    public void instantiateGooglePrice(){
        googlePrice = new Double[] {
                359.99,
                9.99,
                61.99,
                24.00,
                519.00,
                19.00,
                119.99,
                119.99,
                104.00,
                104.00,
                19.99,
                189.99,
                15.97,
                34.58,
                9.99,
                199.99,
                291.99,
                199.99,
                99.99,
                129.00,
                129.00,
                109.02,
                19.99,
                169.99,
                53.99,
                30.00,
                30.00,
                279.99,
                199.99
        };
    }

    public void instantiateDescription(){
        description = new String[] {
                "Canon EOS 700D / T5I Rebel Digital SLR",
                "Christmas Songs",
                "Calphalon Pantryware 3-Piece Stainless Steel Multi Pot Set, 8 Quart ",
                "Ever Ready First Aid - On Call First Responder Kit - 147 Piece ",
                "Galaxy 6S Edge",
                "Backyard Grill 17.5” Charcoal Grill ",
                "Beats by Dr. Dre Headphones - Pink",
                "Beats by Dr. Dre Headphones - Black",
                "Iphone 6S",
                "Iphone 6s",
                "Iron Gym Upper Body Bar ",
                "Dell Inspiron 14",
                "I Love You Pillows",
                "Kenmore 0.9 cu. Ft. Countertop Microwave White 73092",
                "Michael Jackson CD ",
                "Hoverboard 360 - Pink",
                "Play Station 4",
                "Hoverboard 360 - White",
                "Samsumg Galaxy Gear S",
                "Beats Pill - Red",
                "Beats Pill - Pink",
                "Weslo CardioStride 3.0 Treadmill",
                "Basketball Portable System Adjustable Hoop Backboard Goal Height Outdoor Pole",
                "Coleman 8-Person Tent",
                "Black & Decker TO1303SB 4-Slice Toaster Oven ",
                "Kate Spade Glass Water Bottle ",
                "MIU Color High Quality Environmental Water Bottle ",
                "Xbox One",
                "Hoverboard 360 - Yellow"
        };
    }

    public void instantiateThumbnail(){
        thumbnail = new int[] {
                R.drawable.canon6dcamera,
                R.drawable.christmasmusic,
                R.drawable.cookingpots,
                R.drawable.firstaid,
                R.drawable.galaxys6edge,
                R.drawable.grill,
                R.drawable.headphonesfemale,
                R.drawable.headphonesmale,
                R.drawable.iphone6plusfemale,
                R.drawable.iphone6plusmale,
                R.drawable.irongym,
                R.drawable.laptop,
                R.drawable.lovepillow,
                R.drawable.microwave,
                R.drawable.music,
                R.drawable.pinkhoverfemale,
                R.drawable.ps4,
                R.drawable.scooterskateboardmale,
                R.drawable.smartwatch,
                R.drawable.speakermale,
                R.drawable.speakersfemale,
                R.drawable.sportequipment,
                R.drawable.sportshoop,
                R.drawable.tent,
                R.drawable.toasteroven,
                R.drawable.waterbottlefemale,
                R.drawable.waterbottlemale,
                R.drawable.xboxone,
                R.drawable.yellowhoverfemale
        };
    }

    public int getNumberOfItems( ) {

        return itemName.length;
    }

    public String getElement ( String [] item, int index){

        return item[index];
    }

    public String [] genderArray(int gender, String choice){

        if (gender == 0){
            if (choice.equals("Technology")) {
                temp = new String[]{
                        itemName[0],
                        itemName[4],
                        itemName[6],
                        itemName[8],
                        itemName[11],
                        itemName[15],
                        itemName[18],
                        itemName[20],
                        itemName[28]};


            }
            else if (choice.equals("Outdoors")){
                temp = new String[]{
                        itemName[3],
                        itemName[12],
                        itemName[25]};


            }
            else if (choice.equals("Sports")){
                temp = new String[]{
                        itemName[11],
                        itemName[22],
                        itemName[23]};


            }
            else if (choice.equals("Music")){
                temp = new String[]{
                        itemName[6],
                        itemName[14],
                        itemName[20]};


            }
            else if (choice.equals("Cooking")){
                temp = new String[]{
                        itemName[2],
                        itemName[13],
                        itemName[24]};


            }
        }
        else{
            if (choice.equals("Technology")) {
                temp = new String[]{
                        itemName[0],
                        itemName[4],
                        itemName[7],
                        itemName[9],
                        itemName[11],
                        itemName[16],
                        itemName[17],
                        itemName[18],
                        itemName[19],
                        itemName[27]};


            }
            else if (choice.equals("Outdoors")){
                temp = new String[]{
                        itemName[3],
                        itemName[5],
                        itemName[23],
                        itemName[26]};


            }
            else if (choice.equals("Sports")){
                temp = new String[]{
                        itemName[10],
                        itemName[21],
                        itemName[22]};


            }
            else if (choice.equals("Music")){
                temp = new String[]{
                        itemName[7],
                        itemName[14],
                        itemName[19]};


            }
            else if (choice.equals("Cooking")){
                temp = new String[]{
                        itemName[2],
                        itemName[5],
                        itemName[13],
                        itemName[24]};


            }
        }
        return temp;
    }

    public int [] thumbnailArray(int gender, String choice){
        if (gender == 0){
            if (choice.equals("Technology")) {

                temp1 = new int[] {
                        thumbnail[0],
                        thumbnail[4],
                        thumbnail[6],
                        thumbnail[8],
                        thumbnail[11],
                        thumbnail[15],
                        thumbnail[18],
                        thumbnail[20],
                        thumbnail[28]};
            }
            else if (choice.equals("Outdoors")){
                temp1 = new int[] {
                        thumbnail[3],
                        thumbnail[12],
                        thumbnail[25]};
            }
            else if (choice.equals("Sports")){
                temp1 = new int[] {
                        thumbnail[11],
                        thumbnail[22],
                        thumbnail[23]};
            }
            else if (choice.equals("Music")){
                temp1 = new int[] {
                        thumbnail[6],
                        thumbnail[14],
                        thumbnail[20]};
            }
            else if (choice.equals("Cooking")){
                temp1 = new int[] {
                        thumbnail[2],
                        thumbnail[13],
                        thumbnail[24]};
            }
        }
        else{
            if (choice.equals("Technology")) {
                temp1 = new int[] {
                        thumbnail[0],
                        thumbnail[4],
                        thumbnail[7],
                        thumbnail[9],
                        thumbnail[11],
                        thumbnail[16],
                        thumbnail[17],
                        thumbnail[18],
                        thumbnail[19],
                        thumbnail[27]};
            }
            else if (choice.equals("Outdoors")){
                temp1 = new int[] {
                        thumbnail[3],
                        thumbnail[5],
                        thumbnail[23],
                        thumbnail[26]};
            }
            else if (choice.equals("Sports")){
                temp1 = new int[] {
                        thumbnail[10],
                        thumbnail[21],
                        thumbnail[22]};
            }
            else if (choice.equals("Music")){
                temp1 = new int[] {
                        thumbnail[7],
                        thumbnail[14],
                        thumbnail[19]};
            }
            else if (choice.equals("Cooking")){
                temp1 = new int[] {
                        thumbnail[2],
                        thumbnail[5],
                        thumbnail[13],
                        thumbnail[24]};
            }
        }
        return temp1;
    }

    public String [] descriptionArray(int gender, String choice) {
        if (gender == 0) {
            if (choice.equals("Technology")) {
                temp2 = new String[]{
                        description[0],
                        description[4],
                        description[6],
                        description[8],
                        description[11],
                        description[15],
                        description[18],
                        description[20],
                        description[28]};

            } else if (choice.equals("Outdoors")) {
                temp2 = new String[]{
                        description[3],
                        description[12],
                        description[25]};
            } else if (choice.equals("Sports")) {
                temp2 = new String[]{
                        description[11],
                        description[22],
                        description[23]};
            } else if (choice.equals("Music")) {
                temp2 = new String[]{
                        description[6],
                        description[14],
                        description[20]};
            } else if (choice.equals("Cooking")) {

                temp2 = new String[]{
                        description[2],
                        description[13],
                        description[24]};
            }
        } else {
            if (choice.equals("Technology")) {
                temp2 = new String[]{
                        description[0],
                        description[4],
                        description[7],
                        description[9],
                        description[11],
                        description[16],
                        description[17],
                        description[18],
                        description[19],
                        description[27]};

            } else if (choice.equals("Outdoors")) {
                temp2 = new String[]{
                        description[3],
                        description[5],
                        description[23],
                        description[26]};
            } else if (choice.equals("Sports")) {
                temp2 = new String[]{
                        description[10],
                        description[21],
                        description[22]};
            } else if (choice.equals("Music")) {
                temp2 = new String[]{
                        description[7],
                        description[14],
                        description[19]};
            } else if (choice.equals("Cooking")) {

                temp2 = new String[]{
                        description[2],
                        description[5],
                        description[13],
                        description[24]};
            }
        }
        return  temp2;
    }

    public void setDescription (String str){
        descriptionStr = str;
    }

    public void setImgID (int id){
        imgID = id;
    }

    public  void setPrice ( double p){
        price = p;
    }

    public void setHprice (double hp){
        hprice = hp;
    }

    public void setMprice (double mp){
        mprice = mp;
    }

    public void setPriceStr (String p){
        priceStr = p;
    }

    public void setHpStr (String hp){
        hpStr = hp;
    }

    public void  setMpStr (String mp){
        mpStr = mp;
    }

    public double getPrice(){return price;}

    public double getHprice(){return hprice;}

    public double getMprice(){return mprice;}

    public String getPriceStr(){return priceStr;}

    public String getHpStr(){return hpStr;}

    public String getMpStr(){return mpStr;}

    public String getDescriptionStr(){
        return descriptionStr;
    }

    public int getImgID(){
        return  imgID;
    }

    public Double [] lowest(int gender, String choice){
        if (gender == 0){
            if (choice.equals("Technology")) {
                amazonPrice = new Double[] {
                        amazonPrice[0],
                        amazonPrice[4],
                        amazonPrice[6],
                        amazonPrice[8],
                        amazonPrice[11],
                        amazonPrice[15],
                        amazonPrice[18],
                        amazonPrice[20],
                        amazonPrice[28]};
                ebayPrice = new Double[] {
                        ebayPrice[0],
                        ebayPrice[4],
                        ebayPrice[6],
                        ebayPrice[8],
                        ebayPrice[11],
                        ebayPrice[15],
                        ebayPrice[18],
                        ebayPrice[20],
                        ebayPrice[28]};
                googlePrice = new Double[] {
                        googlePrice[0],
                        googlePrice[4],
                        googlePrice[6],
                        googlePrice[8],
                        googlePrice[11],
                        googlePrice[15],
                        googlePrice[18],
                        googlePrice[20],
                        googlePrice[28]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice,ebayPrice,googlePrice);
            }
            else if (choice.equals("Outdoors")){
                amazonPrice = new Double[] {
                        amazonPrice[3],
                        amazonPrice[12],
                        amazonPrice[25]};
                ebayPrice = new Double[] {
                        ebayPrice[3],
                        ebayPrice[12],
                        ebayPrice[25]};
                googlePrice = new Double[] {
                        googlePrice[3],
                        googlePrice[12],
                        googlePrice[25]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Sports")){
                amazonPrice = new Double[] {
                        amazonPrice[11],
                        amazonPrice[22],
                        amazonPrice[23]};
                ebayPrice = new Double[] {
                        ebayPrice[11],
                        ebayPrice[22],
                        ebayPrice[23]};
                googlePrice = new Double[] {
                        googlePrice[11],
                        googlePrice[22],
                        googlePrice[23]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Music")){
                amazonPrice = new Double[] {
                        amazonPrice[6],
                        amazonPrice[14],
                        amazonPrice[20]};
                ebayPrice = new Double[] {
                        ebayPrice[6],
                        ebayPrice[14],
                        ebayPrice[20]};
                googlePrice = new Double[] {
                        googlePrice[6],
                        googlePrice[14],
                        googlePrice[20]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Cooking")){
                amazonPrice = new Double[] {
                        amazonPrice[2],
                        amazonPrice[13],
                        amazonPrice[24]};
                ebayPrice = new Double[] {
                        ebayPrice[2],
                        ebayPrice[13],
                        ebayPrice[24]};
                googlePrice = new Double[] {
                        googlePrice[2],
                        googlePrice[13],
                        googlePrice[24]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
        }
        else{
            if (choice.equals("Technology")) {
                amazonPrice = new Double[] {
                        amazonPrice[0],
                        amazonPrice[4],
                        amazonPrice[7],
                        amazonPrice[9],
                        amazonPrice[11],
                        amazonPrice[16],
                        amazonPrice[17],
                        amazonPrice[18],
                        amazonPrice[19],
                        amazonPrice[27]};
                ebayPrice = new Double[] {
                        ebayPrice[0],
                        ebayPrice[4],
                        ebayPrice[7],
                        ebayPrice[9],
                        ebayPrice[11],
                        ebayPrice[16],
                        ebayPrice[17],
                        ebayPrice[18],
                        ebayPrice[19],
                        ebayPrice[27]};
                googlePrice = new Double[] {
                        googlePrice[0],
                        googlePrice[4],
                        googlePrice[7],
                        googlePrice[9],
                        googlePrice[11],
                        googlePrice[16],
                        googlePrice[17],
                        googlePrice[18],
                        googlePrice[19],
                        googlePrice[27]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Outdoors")){
                amazonPrice = new Double[] {
                        amazonPrice[3],
                        amazonPrice[5],
                        amazonPrice[23],
                        amazonPrice[26]};
                ebayPrice = new Double[] {
                        ebayPrice[3],
                        ebayPrice[5],
                        ebayPrice[23],
                        ebayPrice[26]};
                googlePrice = new Double[] {
                        googlePrice[3],
                        googlePrice[5],
                        googlePrice[23],
                        googlePrice[26]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Sports")){
                amazonPrice = new Double[] {
                        amazonPrice[10],
                        amazonPrice[21],
                        amazonPrice[22]};
                ebayPrice = new Double[] {
                        ebayPrice[10],
                        ebayPrice[21],
                        ebayPrice[22]};
                googlePrice = new Double[] {
                        googlePrice[10],
                        googlePrice[21],
                        googlePrice[22]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Music")){
                amazonPrice = new Double[] {
                        amazonPrice[7],
                        amazonPrice[14],
                        amazonPrice[19]};
                ebayPrice = new Double[] {
                        ebayPrice[7],
                        ebayPrice[14],
                        ebayPrice[19]};
                googlePrice = new Double[] {
                        googlePrice[7],
                        googlePrice[14],
                        googlePrice[19]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice, googlePrice);
            }
            else if (choice.equals("Cooking")){
                amazonPrice = new Double[] {
                        amazonPrice[2],
                        amazonPrice[5],
                        amazonPrice[13],
                        amazonPrice[24]};
                ebayPrice = new Double[] {
                        ebayPrice[2],
                        ebayPrice[5],
                        ebayPrice[13],
                        ebayPrice[24]};
                googlePrice = new Double[] {
                        googlePrice[2],
                        googlePrice[5],
                        googlePrice[13],
                        googlePrice[24]};
                low = findLowest(amazonPrice,ebayPrice,googlePrice);
                high = findHighest(amazonPrice, ebayPrice, googlePrice);
                mid = findMid(amazonPrice, ebayPrice,googlePrice);
            }
        }
        return low;
    }

    public Double [] findLowest(Double [] am, Double [] eb, Double [] go ){
        temp6 = new Double[am.length];
        lowStr = new String[am.length];
        for ( int i = 0; i < am.length; i++ ) {
            if (am[i] <= eb[i] && am[i] <= go[i]) {
                temp6[i] = am[i];
                lowStr[i] = "Amazon";
            }
            else if (eb[i] <= am[i] && eb[i] <= go[i]) {
                temp6[i] = eb[i];
                lowStr[i] = "EBay";
            }
            else {
                temp6[i] = go[i];
                lowStr[i] = "Google Products";
            }
        }
        return temp6;
    }

    public Double [] findHighest(Double [] am, Double [] eb, Double [] go ){
        temp7 = new Double[am.length];
        highStr = new String[am.length];
        for ( int i = 0; i < am.length; i++ ) {
            if (am[i] >= eb[i] && am[i] >= go[i]) {
                temp7[i] = am[i];
                highStr[i] = "Amazon";
            }
            else if (eb[i] >= am[i] && eb[i] >= go[i]) {
                temp7[i] = eb[i];
                highStr[i] = "EBay";
            }
            else {
                temp7[i] = go[i];
                highStr[i] = "Google Products";
            }
        }
        return temp7;
    }

    public Double [] findMid(Double [] am, Double [] eb, Double [] go ){
        temp9 = new Double[am.length];
        midStr = new String[am.length];
        for ( int i = 0; i < am.length; i++ ) {
            if( eb[i]>am[i] && am[i]>go[i] || go[i]>am[i] && am[i]>eb[i] )
            {
                temp9[i] = am[i];
                midStr[i] = "Amazon";
            }
            if( am[i]>eb[i] && eb[i]>go[i] || go[i]>eb[i] && eb[i]>am[i] )
            {
                temp9[i] = eb[i];
                midStr[i] = "EBay";
            }
            if( am[i]>go[i] && go[i]>eb[i] || eb[i]>go[i] && go[i]>am[i] )
            {
                temp9[i] = go[i];
                midStr[i] = "Google";
            }
        }
        return temp9;
    }


}