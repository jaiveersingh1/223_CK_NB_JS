package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by jsboygenius on 1/22/18.
 */


public class Family {
    public final String TAG = Family.class.getName();
    private ArrayList family;
    private static Family sFamily = new Family();

    private Family() {
        family = new ArrayList<FamilyMember>();
        family.add(new Guardian("Guard1", "Guard2"));
        family.add(new Guardian());
    }

    public static Family get() {
        if(sFamily == null) {
          sFamily = new Family();
        }
        return sFamily;
    }

    public ArrayList getFamily() {
        return family;
    }

    public void setFamily(ArrayList family) {
        this.family = family;
    }
}
