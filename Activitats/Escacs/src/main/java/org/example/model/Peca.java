package org.example.model;

import java.util.*;

public abstract class Peca {
    protected final int MIN_HORITZONTAL = 0;
    protected final int MIN_VERTICAL = 0;
    protected final int MAX_HORITZONTAL = 7;
    protected final int MAX_VERTICAL = 7;

    //Encapsular un campo
    private int actualHoritzontal;
    private int actualVertical;

    //Encapsular un Collection
    private List<String> historicMoviments = new ArrayList<>();


    public abstract boolean moviment(int destiHoritzontal, int destiVertical);

    public int numMoviments () {
        return this.actualHoritzontal * this.actualVertical;
    }

    public boolean isPotMoureCapEnrere() {
        return false;
    }

    public int getActualHoritzontal() {
        return actualHoritzontal;
    }

    public void setActualHoritzontal(int actualHoritzontal) {
        this.actualHoritzontal = actualHoritzontal;
    }

    public int getActualVertical() {
        return actualVertical;
    }

    public void setActualVertical(int actualVertical) {
        this.actualVertical = actualVertical;
    }


    public void addHistoricMoviment(String moviment) {
        this.historicMoviments.add(moviment);
    }

    public void removeHistoricMoviment(String moviment) {
        this.historicMoviments.remove(moviment);
    }

    public int sizeHistoricMoviment() {
        return this.historicMoviments.size();
    }


    public String getHistoricMovimentByIndex(int indice) {
        return this.historicMoviments.get(indice);
    }

    //Optional<String>
    public String getHistoricMovimentByString(String moviment) {
        for (int i = 0; i < this.sizeHistoricMoviment(); i++) {
            if (this.historicMoviments.get(i).equals(moviment)) {
                return this.historicMoviments.get(i);
                //return this.historicMoviments.get(i).describeConstable();
            }
        }

        for (String s : this.historicMoviments) {
            if (s.equals(moviment)) {
                return s;
            }
        }

        //return this.historicMoviments.stream().filter(s->s.equals(moviment)).toList().get(0);

        return null;
    }
}
