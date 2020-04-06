package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {
    @XmlValue
    private String name;

    @XmlAttribute
    private int count;
}
