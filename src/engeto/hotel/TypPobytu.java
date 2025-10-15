package engeto.hotel;

import com.sun.beans.introspect.PropertyInfo;

import java.util.Properties;

import static com.sun.beans.introspect.PropertyInfo.Name.description;

public enum TypPobytu {
    PRAC("pracovní"),
    REKRE("rekreační");


    TypPobytu(String pracovní) {
    }

    public PropertyInfo.Name getDescription() {
        return description;
    }


}