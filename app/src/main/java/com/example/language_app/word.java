package com.example.language_app;

public class word {
    private String mDefaultTranslation;

    private String mbengaliTranslation;

    private int mResourceImageId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;


    public word(String defaultTranslation, String bengaliTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mbengaliTranslation=bengaliTranslation;
    }

    public word(String defaultTranslation, String bengaliTranslation, int ResourceImageId)
    {
        mDefaultTranslation=defaultTranslation;
        mbengaliTranslation=bengaliTranslation;
        mResourceImageId=ResourceImageId;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmbengaliTranslation()
    {
        return mbengaliTranslation;
    }

    public int getImageResourceId(){ return mResourceImageId; }

    public boolean hasimage(){
        return mResourceImageId!=NO_IMAGE_PROVIDED;
    }
}