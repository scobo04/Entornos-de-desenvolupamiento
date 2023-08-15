package org.example.model;

public class Reina extends Peca {
    private final int MAX_MOVIMENTS_HORITZONTALS = 7;
    private final int MAX_MOVIMENTS_VERTICALS = 7;

    public boolean moviment (int destiHoritzontal, int destiVertical) {

        boolean limitHoritzontal = this.comprovarHoritzontal(destiHoritzontal);
        boolean limitVertical = this.comprovarVertical(destiVertical);

        boolean limit = limitHoritzontal && limitVertical;
        boolean valid = this.comprovarMoviments(destiHoritzontal, destiVertical);

        return limit && valid;
    }

    private boolean comprovarHoritzontal(int destiHoritzontal) {
        boolean limitMaximHoritzontal = destiHoritzontal <= MAX_HORITZONTAL;
        boolean limitMinimHoritzontal = destiHoritzontal >= MIN_HORITZONTAL;
        return limitMaximHoritzontal && limitMinimHoritzontal;
    }

    private boolean comprovarVertical(int destiVertical) {
        boolean limitMaximVertical = destiVertical <= MAX_VERTICAL;
        boolean limitMinimVertical = destiVertical >= MIN_VERTICAL;
        return limitMinimVertical && limitMaximVertical;
    }

    private boolean comprovarMoviments(int destiHoritzontal, int destiVertical) {
        boolean validHoritzontal = Math.abs(destiHoritzontal - this.getActualHoritzontal()) <= MAX_MOVIMENTS_HORITZONTALS;
        boolean validVertical = Math.abs(destiVertical - this.getActualVertical()) <= MAX_MOVIMENTS_VERTICALS;
        return validHoritzontal && validVertical;
    }

    @Override
    public int numMoviments () {
        return 8;
    }

    public boolean isPotMoureCapEnrere () {
        return true;
    }

}
