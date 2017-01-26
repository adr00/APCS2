package January.Assignment2;
public class Light {
    // Variables that will be initialized in the Light constructors.
    private boolean on;
    private boolean burntOut;
    private String color = "";

    // Default constructor that sets the bulb to on, not burnt out, and "white".
    public Light() {
        on = true;
        burntOut = false;
        color = "white";
    }

    // This constructor sets the variable "on" to the parameter o. The burntOut
    // variable is set to the parameter b. If burntOut
    // is true, on is set to false, no matter what value is stored in o.
    // The color variable is set to the parameter c only if c is "red", "green"
    // or "blue". The constructor ignores the case of the value in c. If c holds
    // any value other than "red", "green" or "blue", the constructor sets
    // color to "white".
    public Light(boolean o, boolean b, String c) {
        burntOut = b;
        if (burntOut) {
            on = false;
        } else if (!burntOut) {
            on = o;
        }
        if (c.toUpperCase().equals("RED") || c.toUpperCase().equals("GREEN") || c.toUpperCase().equals("BLUE")) {
            color = c;
        } else if (c.toUpperCase().compareTo("RED") != 0 || c.toUpperCase().compareTo("GREEN") != 0 || c.toUpperCase().compareTo("BLUE") != 0) {
            color = "white";
        }

    }

    // The toString method returns a String with the Light in the format:
    // red    off burnt out
    // green    on not burnt out
    //
    // Notice there is a tab between the value for color and "off"/"on"
    // and one space before the "burnt out" or "not burnt out".
    public String toString() {
        String finalstring = color;
        finalstring = finalstring.concat("\t");
        if (on) {
            finalstring = finalstring.concat("on ");
        }
        if (!on) {
            finalstring = finalstring.concat("off ");
        }
        if (burntOut) {
            finalstring = finalstring.concat("burnt out");
        }
        if (!burntOut) {
            finalstring = finalstring.concat("not burnt out");
        }
        return finalstring;
    }

    // This method changes the bulb from on to off, or visa versa. If the
    // burntOut variable is true, then the on variable may only be set to false.
    public void flip() {
        if (burntOut) {
            on = false;
        }
        else {
            if (on) {
                on = false;
            }
            else {
                on = true;
            }
        }
    }

    // The getColor method returns the color of the bulb.
    public String getColor() {
        return color;
    }

    // The setColor method sets the color of the Light. The color variable is
    // set to c only if c is "red", "green" or "blue". The method ignore the
    // case of the value in c. If c holds any value other than "red", "green"
    // or "blue", color will be set to "white".
    public void setColor(String c) {
        if (c.toUpperCase().equals("RED") || c.toUpperCase().equals("GREEN") || c.toUpperCase().equals("BLUE")) {
            color = c.toLowerCase();
        } else if (c.toUpperCase().compareTo("RED") != 0 || c.toUpperCase().compareTo("GREEN") != 0 || c.toUpperCase().compareTo("BLUE") != 0) {
            color = "white";
        }
    }

    // The isOn method returns true if on, false otherwise.
    public boolean isOn() {
        if (on) {
            return true;
        }
        return false;

    }

    // The burnOut method sets the variable burntOut to true.
    public void burnOut()
    {
        burntOut = true;
        on = false;
    }
}