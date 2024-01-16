package com.victoralvesf.rest.core;

import io.restassured.http.ContentType;

public interface Constants {
    String APP_BASE_URL = "https://barrigarest.wcaquino.me";
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
    long MAX_TIMEOUT = 5000L;
}
