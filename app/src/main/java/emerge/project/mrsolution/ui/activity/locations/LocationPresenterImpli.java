package emerge.project.mrsolution.ui.activity.locations;


import android.content.Context;

import java.util.ArrayList;

import emerge.project.mrsolution.utils.entittes.District;
import emerge.project.mrsolution.utils.entittes.LocationEntitie;
import emerge.project.mrsolution.utils.entittes.LocationType;


/**
 * Created by Himanshu on 4/4/2017.
 */

public class LocationPresenterImpli implements LocationPresenter,
        LocationInteractor.OnGetLocationFinishedListener,
LocationInteractor.OnGetDistrictFinishedListener,
LocationInteractor.OnSelectedDistrictIDFinishedListener,
LocationInteractor.OnPostLocationFinishedListener,
LocationInteractor.OnGetLocationTypeListFinishedListener,
LocationInteractor.OnSelectedLocationTypeFinishedListener{


    private LocationView locationView;
    LocationInteractor locationInteractor;


    public LocationPresenterImpli(LocationView vocationview) {
        this.locationView = vocationview;
        this.locationInteractor = new LocationInteractorImpil();

    }



    @Override
    public void getLocation(Context context) {
        locationInteractor.getLocation(context,this);
    }


    @Override
    public void locationList(ArrayList<LocationEntitie> locationArrayList) {
        locationView.locationList(locationArrayList);
    }

    @Override
    public void noLocation() {
        locationView.noLocation();
    }

    @Override
    public void locationFail(String failMsg) {
        locationView.locationFail(failMsg);
    }

    @Override
    public void locationNetworkFail() {
        locationView.locationNetworkFail();
    }







    @Override
    public void getDistrict(Context context) {
        locationInteractor.getDistrict(context,this);
    }

    @Override
    public void districtList(ArrayList<District> districtArrayList, ArrayList<String> districtNameList) {
        locationView.districtList( districtArrayList,districtNameList);
    }

    @Override
    public void noDistrict() {
        locationView.noDistrict();
    }

    @Override
    public void districtFail(String failMsg) {
        locationView.districtFail(failMsg);
    }

    @Override
    public void districtNetworkFail() {
        locationView.districtNetworkFail();
    }




    @Override
    public void getSelectedDistrictID(ArrayList<District> districtArrayList, String name) {
        locationInteractor.getSelectedDistrictID(districtArrayList,name,this);
    }


    @Override
    public void selectedDistrictID(int selectedDsistrictId) {
        locationView.selectedDistrictID(selectedDsistrictId);
    }




    @Override
    public void postLocation(Context context, LocationEntitie locationEntitie,int isAfterSuggestion) {
        locationInteractor.postLocation(context,locationEntitie, isAfterSuggestion,this);
    }



    @Override
    public void postLocationError(String msg) {
        locationView.postLocationError(msg);
    }

    @Override
    public void postLocationSuccess() {
        locationView.postLocationSuccess();
    }

    @Override
    public void postLocationDuplicate(ArrayList<LocationEntitie> duplicateLocationList, LocationEntitie locationEntitie, int isAfterSuggestion) {
        locationView.postLocationDuplicate( duplicateLocationList,  locationEntitie,isAfterSuggestion);
    }

    @Override
    public void postLocationFail(String failMsg, LocationEntitie location,int isAfterSuggestion) {
        locationView.postLocationFail(failMsg,location, isAfterSuggestion);
    }

    @Override
    public void postLocationNetworkFail() {
        locationView.postLocationNetworkFail();
    }





    @Override
    public void getLocationType(Context context) {
        locationInteractor.getLocationType(context,this);
    }


    @Override
    public void locationTypeList(ArrayList<LocationType> locationTypeList) {
        locationView.locationTypeList(locationTypeList);
    }

    @Override
    public void locationTypeListEmpty() {
        locationView.locationTypeListEmpty();
    }

    @Override
    public void locationTypeListgetingFail(String failMsg) {
        locationView.locationTypeListgetingFail(failMsg);
    }

    @Override
    public void locationTypeListNetworkFail() {
        locationView.locationTypeListNetworkFail();
    }



    @Override
    public void getSelectedLocationType(LocationType locationType) {
        locationInteractor.getSelectedLocationType(locationType,this);
    }

    @Override
    public void selectedLocationType(LocationType locationType) {
        locationView.selectedLocationType(locationType);
    }
}
