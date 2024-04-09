


package ru.netology.graphics.image;

public class ColorShema_Test implements TextColorSchema{
    @Override
    public char convert(int color) {
        //return 0;
        if (color >=240)
            return ' ';
        if (color >=200)
            return '-';
        else if (color >=190)
            return '+';
        else if (color >=170)
            return '*';
        else if (color >=120)
            return '%';
        else if (color >=110)
            return '@';
        else if (color >=80)
            return '$';
        else if (color >=60)
            return '#';
        else    return ' ';
    }
}
