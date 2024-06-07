package com.example.dialogdemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WeatherService
{
    public static List<WeatherInfo> getInfosFromJson(InputStream is) throws IOException {
        List<WeatherInfo> weatherInfos = null;

        Gson gson = new Gson();
        Type Listype = new TypeToken<List<WeatherInfo>>(){}.getType();

        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        String json = new String(buffer, StandardCharsets.UTF_8);
        weatherInfos = gson.fromJson(json,Listype);
        return weatherInfos;
    }
}
