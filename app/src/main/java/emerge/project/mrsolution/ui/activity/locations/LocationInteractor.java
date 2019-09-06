package emerge.project.mrsolution.ui.activity.locations;


import android.content.Context;
import android.location.Location;

import java.util.ArrayList;

import emerge.project.mrsolution.utils.entittes.District;
import emerge.project.mrsolution.utils.entittes.LocationEntitie;
import emerge.project.mrsolution.utils.entittes.LocationType;

/**
 * Created by Himanshu on 4/4/2017.
 */

public interface LocationInteractor {

    interface OnGetLocationFinishedListener {
        void locationList(ArrayList<LocationEntitie> locationArrayList);
        void noLocation();
        void locationFail(String failMsg);
        void locationNetworkFail();
    }
    void getLocation(Context context, OnGetLocationFinishedListener onGetLocationFinishedListener);



    interface OnGetDistrictFinishedListener {
        void districtList(ArrayList<District> districtArrayList,ArrayList<String> districtNameList);
        void noDistrict();
        void districtFail(String failMsg);
        void districtNetworkFail();
    }
    void getDistrict(Context context, OnGetDistrictFinishedListener onGetDistrictFinishedListener);


    interface OnSelectedDistrictIDFinishedListener {
        void selectedDistrictID(int selectedDsistrictId);
    }
    void getSelectedDistrictID(ArrayList<District> districtArrayList,String name ,OnSelectedDistrictIDFinishedListener onSelectedDistrictIDFinishedListener);


    interface OnPostLocationFinishedListener {
        void  postLocationError(String msg);
        void  postLocationSuccess();
        void  postLocationDuplicate(ArrayList<LocationEntitie> duplicateLocationList, LocationEntitie locationEntitie,int isAfterSuggestion);
        void  postLocationFail(String failMsg,LocationEntitie location,int isAfterSuggestion);
        void  postLocationNetworkFail();
    }
    void postLocation(Context context, LocationEntitie locationEntitie,int isAfterSuggestion, OnPostLocationFinishedListener onPostLocationFinishedListener);



    interface OnGetLocationTypeListFinishedListener {
        void locationTypeList(ArrayList<LocationType> locationTypeList);
        void locationTypeListEmpty();
        void locationTypeListgetingFail(String failMsg);
        void locationTypeListNetworkFail();
    }
    void getLocationType(Context context, OnGetLocationTypeListFinishedListener onGetLocationTypeListFinishedListener);



    interface OnSelectedLocationTypeFinishedListener {
        void selectedLocationType(LocationType locationType);
    }
    void getSelectedLocationType(LocationType locationType,OnSelectedLocationTypeFinishedListener onSelectedLocationTypeFinishedListener);


}
