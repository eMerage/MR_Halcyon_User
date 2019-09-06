package emerge.project.mrsolution.ui.activity.locations;


import android.content.Context;

import java.util.ArrayList;

import emerge.project.mrsolution.utils.entittes.District;
import emerge.project.mrsolution.utils.entittes.LocationEntitie;
import emerge.project.mrsolution.utils.entittes.LocationType;


/**
 * Created by Himanshu on 4/4/2017.
 */

public interface LocationPresenter {

    void getLocation(Context context);
    void getDistrict(Context context);
    void getSelectedDistrictID(ArrayList<District> districtArrayList, String name);
    void postLocation(Context context, LocationEntitie locationEntitie,int isAfterSuggestion);

    void getLocationType(Context context);
    void getSelectedLocationType(LocationType locationType);

}
