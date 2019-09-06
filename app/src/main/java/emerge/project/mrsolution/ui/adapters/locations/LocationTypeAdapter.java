package emerge.project.mrsolution.ui.adapters.locations;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import emerge.project.mrsolution.R;
import emerge.project.mrsolution.ui.activity.doctors.DoctorsPresenter;
import emerge.project.mrsolution.ui.activity.doctors.DoctorsPresenterImpli;
import emerge.project.mrsolution.ui.activity.doctors.DoctorsView;
import emerge.project.mrsolution.ui.activity.locations.LocationPresenter;
import emerge.project.mrsolution.ui.activity.locations.LocationPresenterImpli;
import emerge.project.mrsolution.ui.activity.locations.LocationView;
import emerge.project.mrsolution.utils.entittes.Doctor;
import emerge.project.mrsolution.utils.entittes.LocationType;
import emerge.project.mrsolution.utils.entittes.Specialization;


/**
 * Created by Himanshu on 4/10/2015.
 */
public class LocationTypeAdapter extends RecyclerView.Adapter<LocationTypeAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<LocationType> typeItems;


    LocationPresenter locationPresenter;

    public LocationTypeAdapter(Context mContext, ArrayList<LocationType> item, LocationView locationView) {
        this.mContext = mContext;
        this.typeItems = item;
        locationPresenter = new LocationPresenterImpli(locationView);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_locationtype, parent, false);

        return new MyViewHolder(itemView);


    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {


        final LocationType locationType = typeItems.get(position);

        if (locationType.isSelect()) {
            holder.cardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorgold));
        } else {
            holder.cardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.colorWhite));
        }

        holder.textviewSpec.setText(locationType.getName());


        holder.relativeLayoutMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(LocationType ltype:typeItems){
                    ltype.setSelect(false);
                }
                typeItems.get(position).setSelect(true);
                notifyDataSetChanged();
                locationPresenter.getSelectedLocationType(locationType);

            }
        });

    }

    @Override
    public int getItemCount() {
        return typeItems.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.card_view)
        CardView cardView;

        @BindView(R.id.relativeLayout_header_main)
        RelativeLayout relativeLayoutMain;


        @BindView(R.id.textview_spec)
        TextView textviewSpec;



        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }



}
