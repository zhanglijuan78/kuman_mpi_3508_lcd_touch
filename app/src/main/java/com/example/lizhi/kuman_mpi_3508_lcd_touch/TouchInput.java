package com.example.lizhi.kuman_mpi_3508_lcd_touch;

/**
 * Created by lizhi on 5/2/18.
 */

public class TouchInput {
    public int x;
    public int y;
    public boolean pressing;

    public TouchInput(int x, int y, boolean touching) {
        this.x = x;
        this.y = y;
        this.pressing = touching;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchInput x: ");
        sb.append(this.x);
        sb.append(", y: ");
        sb.append(this.y);
        sb.append(", pressing: ");
        sb.append(this.pressing);
        return sb.toString();
    }
}
