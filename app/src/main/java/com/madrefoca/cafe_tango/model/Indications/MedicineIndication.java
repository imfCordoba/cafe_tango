package com.madrefoca.cafe_tango.model.Indications;

import com.madrefoca.cafe_tango.model.Medicine;

/**
 * Created by iascierto on 10/8/17.
 */

public class MedicineIndication extends Indication {

    private int amount;
    private long frequency;
    private long period;

    @Override
    public String indicate() {
        //TODO indicar indicación de Medicamento

        return null;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public void setPeriod(long period) {
        this.period = period;
    }
}
