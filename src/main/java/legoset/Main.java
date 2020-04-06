package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        List<Minifig> minifigs = new ArrayList<Minifig>();
        //Ez itt elég csúnyán lett megoldva
        Minifig mf1 = new Minifig();
        Minifig mf2 = new Minifig();
        Minifig mf3 = new Minifig();
        mf1.setName("Imperial Mudtrooper");
        mf1.setCount(2);
        minifigs.add(mf1);
        mf2.setName("Imperial Pilot");
        mf2.setCount(1);
        minifigs.add(mf2);
        mf3.setName("Mimban Stormtrooper");
        mf3.setCount(1);
        minifigs.add(mf3);
        legoset.setMinifigs(minifigs);
        Weight weight = new Weight();
        weight.setValue(0.89);
        weight.setUnit("kg");
        legoset.setWeight(weight);
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoset.setNumber(75211);

        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("movie.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("movie.xml")));
    }

}