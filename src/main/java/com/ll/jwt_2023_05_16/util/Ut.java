package com.ll.jwt_2023_05_16.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Ut {
    public static class json {

        public static Object toStr(Map<String, Object> map) {
            try {
                return new ObjectMapper().writeValueAsString(map);
            } catch (JsonProcessingException e) {
                return null;
            }
        }
    }

    ;
}