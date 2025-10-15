package engeto.hotel;

import com.sun.beans.introspect.PropertyInfo;

import java.util.Properties;

import static com.sun.beans.introspect.PropertyInfo.Name.description;

public enum TypPobytu {
    PRAC("pracovní"),
    REKRE("rekreační");

     public PropertyInfo.Name getDescription() {
        return description;
    }


}