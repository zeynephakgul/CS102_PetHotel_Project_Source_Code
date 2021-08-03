package PetHotel;

import java.sql.SQLOutput;
import java.util.SortedMap;

/**
 * This is Card Registration page's model class. It checks if the credit card number taken in the view is valid.
 *
 * @author İlayda Zehra Yılmaz
 * @version 03/08/2021
 */

public class CardRegModel {

    String CardNum;

    public CardRegModel( CardRegView cardRegView ){
    }

    public boolean checkConditions( String CardNum ){

        //Converting String input to int
        int[] cardNumInt = new int[ CardNum.length() ];

        for ( int i = 0; i < CardNum.length(); i++ ){
            cardNumInt[ i ] = Integer.parseInt( CardNum.substring( i, i + 1 ) );
        }

        //Validating using Luhn Algorithm
        for ( int i = cardNumInt.length - 2; i >= 0; i = i - 2 ){
            int temp = cardNumInt[ i ];
            temp = temp * 2;

            if ( temp > 9 ){
                temp = temp % 10 + 1;
            }
            cardNumInt[ i ] = temp;
        }

        int sum = 0;

        for ( int i = 0; i < cardNumInt.length; i++){
            sum += cardNumInt[ i ];
        }

        return ( sum % 10 == 0 );
    }
}
