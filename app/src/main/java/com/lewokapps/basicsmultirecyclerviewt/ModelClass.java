package com.lewokapps.basicsmultirecyclerviewt;

public class ModelClass {

    public static final int USER_INFO_LAYOUT = 0;
    public static final int AD_LAYOUT = 1;
    public static final int IMAGE_LAYOUT = 2;

    private int viewType;

    public int getViewType() {
        return viewType;
    }

    ////////// USER INFO

    private String body;

    private int imageResource;

    public ModelClass(int viewType, String body, int imageResource) {
        this.viewType = viewType;
        this.body = body;
        this.imageResource = imageResource;
    }

    public String getBody() {
        return body;
    }

    public int getImageResource() {
        return imageResource;
    }

    ////////// USER INFO


    ////////// AD

    private String adText;

    public ModelClass(int viewType, String adText) {
        this.viewType = viewType;
        this.adText = adText;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }

    ////////// AD

    ////////// IMAGE

    private int resource;

    public ModelClass(int viewType, int resource) {
        this.viewType = viewType;
        this.resource = resource;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    ////////// IMAGE

}
