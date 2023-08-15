package org.example.model;

public class Rei extends Peca {
    //magic number
    private final int MAX_MOVIMENTS_HORITZONTALS = 1;
    private final int MAX_MOVIMENTS_VERTICALS = 1;

    public boolean moviment (int destiHoritzontal, int destiVertical) {
        boolean limitMaximHoritzontal = destiHoritzontal <= MAX_HORITZONTAL;
        boolean limitMinimHoritzontal = destiHoritzontal >= MIN_HORITZONTAL;
        boolean limitHoritzontal = limitMaximHoritzontal && limitMinimHoritzontal;

        boolean limitMaximVertical = destiVertical <= MAX_VERTICAL;
        boolean limitMinimVertical = destiVertical >= MIN_VERTICAL;
        boolean limitVertical = limitMaximVertical && limitMinimVertical;
        boolean limit = limitHoritzontal && limitVertical;

        boolean validHoritzontal = Math.abs(destiHoritzontal - this.getActualHoritzontal()) <= MAX_MOVIMENTS_HORITZONTALS;
        boolean validVertical = Math.abs(destiVertical - this.getActualVertical()) <= MAX_MOVIMENTS_VERTICALS;
        boolean valid = validHoritzontal && validVertical;

        return limit && valid;
    }

    @Override
    public int numMoviments () {
        return 1;
    }

    public boolean isPotMoureCapEnrere () {
        return true;
    }

}
