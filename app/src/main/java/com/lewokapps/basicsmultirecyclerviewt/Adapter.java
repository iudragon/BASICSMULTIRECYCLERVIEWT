package com.lewokapps.basicsmultirecyclerviewt;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter {

    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @Override
    public int getItemViewType(int position) {

        switch (modelClassList.get(position).getViewType()) {

            case 0:

                return ModelClass.USER_INFO_LAYOUT;

            case 1:

                return ModelClass.AD_LAYOUT;

            case 2:

                return ModelClass.IMAGE_LAYOUT;

            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        switch (viewType) {


            case ModelClass.USER_INFO_LAYOUT:

                View userInfoLayout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);

                return new UserInfoLayoutVH(userInfoLayout);

            case ModelClass.AD_LAYOUT:

                View adLayout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_layout, viewGroup, false);

                return new AdlayoutVH(adLayout);
            case ModelClass.IMAGE_LAYOUT:

                View imageLayout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_layout, viewGroup, false);

                return new ImageLayoutVH(imageLayout);

            default:
                return null;

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        switch (modelClassList.get(position).getViewType()) {

            case ModelClass.USER_INFO_LAYOUT:
                int userImage = modelClassList.get(position).getImageResource();
                String body = modelClassList.get(position).getBody();

                ((UserInfoLayoutVH) viewHolder).setData(userImage, body);

                break;

            case ModelClass.AD_LAYOUT:
                String ad = modelClassList.get(position).getAdText();

                ((AdlayoutVH) viewHolder).setAdText(ad);

                break;

            case ModelClass.IMAGE_LAYOUT:
                int resource = modelClassList.get(position).getResource();

                ((ImageLayoutVH) viewHolder).setImageView(resource);
        }
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class UserInfoLayoutVH extends RecyclerView.ViewHolder {

        private ImageView userImage;
        private TextView userBody;

        public UserInfoLayoutVH(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.image_view);
            userBody = itemView.findViewById(R.id.body);
        }

        private void setData(int userImagez, String userBodyz) {

            userImage.setImageResource(userImagez);
            userBody.setText(userBodyz);

        }
    }

    class AdlayoutVH extends RecyclerView.ViewHolder {

        private TextView adText;

        public AdlayoutVH(@NonNull View itemView) {
            super(itemView);

            adText = itemView.findViewById(R.id.ad_text);


        }

        private void setAdText(String ad) {

            adText.setText(ad);
        }

    }

    class ImageLayoutVH extends RecyclerView.ViewHolder {


        private ImageView imageView;


        public ImageLayoutVH(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.main_image);

        }

        private void setImageView(int image) {

            imageView.setImageResource(image);
        }
    }
}
