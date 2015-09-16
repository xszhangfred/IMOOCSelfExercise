import java.util.Comparator;

/**
 * Created by xuesong on 9/14/15.
 */
public class Card implements Comparable<Card>{
    public String cardType;
    public String cardNumber;
    public String cardTypeCompare;
    public String cardNumberCompare;

    public String toString() {
        return cardType + cardNumber;
    }

    @Override
    public int compareTo(Card o) {

        this.cardNumberCompare = this.cardNumber;
        o.cardNumberCompare = o.cardNumber;

        switch(this.cardNumber){
            case "10":
                this.cardNumberCompare = "91";
                break;
            case "J":
                this.cardNumberCompare = "92";
                break;
            case "Q":
                this.cardNumberCompare = "93";
                break;
            case "K":
                this.cardNumberCompare = "94";
                break;
            case "A":
                this.cardNumberCompare = "95";
                break;
        }

        switch(o.cardNumber){
            case "10":
                o.cardNumberCompare = "91";
                break;
            case "J":
                o.cardNumberCompare = "92";
                break;
            case "Q":
                o.cardNumberCompare = "93";
                break;
            case "K":
                o.cardNumberCompare = "94";
                break;
            case "A":
                o.cardNumberCompare = "95";
                break;
        }

        if(this.cardNumberCompare.compareTo(o.cardNumberCompare) != 0)
            return this.cardNumberCompare.compareTo(o.cardNumberCompare);


        switch(this.cardType) {
            case "Spade":
                this.cardTypeCompare = "4";
                break;
            case "Heart":
                this.cardTypeCompare = "3";
                break;
            case "Diamond":
                this.cardTypeCompare = "2";
                break;
            case "Club":
                this.cardTypeCompare = "1";
                break;
        }

        switch(o.cardType) {
            case "Spade":
                o.cardTypeCompare = "4";
                break;
            case "Heart":
                o.cardTypeCompare = "3";
                break;
            case "Diamond":
                o.cardTypeCompare = "2";
                break;
            case "Club":
                o.cardTypeCompare = "1";
                break;
        }

        return this.cardTypeCompare.compareTo(o.cardTypeCompare);

    }

}
