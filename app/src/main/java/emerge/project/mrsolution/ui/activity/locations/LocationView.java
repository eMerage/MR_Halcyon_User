package emerge.project.mrsolution.ui.activity.locations;


import java.util.ArrayList;

import emerge.project.mrsolution.utils.entittes.District;
import emerge.project.mrsolution.utils.entittes.LocationEntitie;
import emerge.project.mrsolution.utils.entittes.LocationType;


/**
 * Created by Himanshu on 4/4/2017.
 */

public interface LocationView {

    void locationList(ArrayList<LocationEntitie> locationArrayList);

    void noLocation();

    void locationFail(String failMsg);

    void locationNetworkFail();


    void districtList(ArrayList<District> districtArrayList, ArrayList<String> districtNameList);
    void noDistrict();
    void districtFail(String failMsg);
    void districtNetworkFail();


    void selectedDistrictID(int selectedDsistrictId);

    void  postLocationError(String msg);
    void  postLocationSuccess();
    void  postLocationFail(String failMsg,LocationEntitie location,int isAfterSuggestion);
    void  postLocationDuplicate(ArrayList<LocationEntitie> duplicateLocationList, LocationEntitie locationEntitie,int isAfterSuggestion);
    void  postLocationNetworkFail();



    void locationTypeList(ArrayList<LocationType> locationTypeList);
    void locationTypeListEmpty();
    void locationTypeListgetingFail(String failMsg);
    void locationTypeListNetworkFail();

    void selectedLocationType(LocationType locationType);



}
