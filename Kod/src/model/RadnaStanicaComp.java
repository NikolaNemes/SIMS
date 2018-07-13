package model;

import java.util.Comparator;

public class RadnaStanicaComp implements Comparator<RadnaStanica> {

    @Override
    public int compare(RadnaStanica o1, RadnaStanica o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
